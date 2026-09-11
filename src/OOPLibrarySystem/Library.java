package OOPLibrarySystem;

import java.util.*;

public class Library {
    private Map<String, LibraryItem> catalog = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();
    private Set<String> borrowedIds = new HashSet<>();

    public void addItem(LibraryItem item) {
        catalog.put(item.getId(), item);
    }

    public void addMember(Member m) {
        members.put(m.getMemberId(), m);
    }

    public void borrowItem(String memberId, String itemId) throws LibraryException {
        Member member = members.get(memberId);
        if (member == null) {
            throw new LibraryException("Member ID " + memberId + " does not exist.");
        }

        LibraryItem item = catalog.get(itemId);
        if (item == null) {
            throw new LibraryException("Item ID " + itemId + " does not exist.");
        }

        if (item.isBorrowed()) {
            throw new LibraryException("item " + itemId + " is already out.");
        }

        if (!member.canBorrowMore()) {
            throw new LibraryException("Member " + memberId + " has reached borrowing limit.");
        }

        item.markBorrowed();
        member.addBorrowedItem(item);
        borrowedIds.add(item.getId());
        System.out.println("Borrowed " + itemId + " to " + memberId + ".");
    }

    public void returnItem(String memberId, String itemId) throws LibraryException {
        Member member = members.get(memberId);
        if (member == null) {
            throw new LibraryException("Member ID " + memberId + " does not exist.");
        }

        LibraryItem item = catalog.get(itemId);
        if (item == null) {
            throw new LibraryException("Item ID " + itemId + " does not exist.");
        }

        if (!member.holdsItem(itemId)) {
            throw new LibraryException("Member " + memberId + " does not hold item " + itemId + ".");
        }

        item.markReturned();
        member.removeBorrowedItem(item);
        borrowedIds.remove(item.getId());
        System.out.println("Returned " + itemId + " from " + memberId + ".");
    }

    public void listCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        for (LibraryItem item : catalog.values()) {
            item.displayInfo();
        }
    }

    public void printReport() {
        System.out.println("---------- REPORT ----------");
        System.out.println("Total items    : " + catalog.size());
        System.out.println("Currently out  : " + borrowedIds.size());
        System.out.println("Borrowed ids   : " + borrowedIds);

        Map<String, Integer> counts = getCountsByType();
        System.out.println("Items by type  : " + counts);
        System.out.println("Total created  : " + LibraryItem.getTotalItemsCreated());
        System.out.println("----------------------------");
    }

    public void searchByTitle(String query) {
        boolean found = false;
        for (LibraryItem item : catalog.values()) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase())) {
                item.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found matching: " + query);
        }
    }

    public void listAvailableItems() {
        boolean found = false;
        for (LibraryItem item : catalog.values()) {
            if (!item.isBorrowed()) {
                item.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available items.");
        }
    }

    public Map<String, Integer> getCountsByType() {
        Map<String, Integer> counts = new HashMap<>();
        for (LibraryItem item : catalog.values()) {
            String type = item.getType();
            counts.put(type, counts.getOrDefault(type, 0) + 1);
        }
        return counts;
    }
}
