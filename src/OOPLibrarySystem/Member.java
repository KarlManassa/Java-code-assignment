package OOPLibrarySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private int maxAllowed;
    private List<LibraryItem> borrowedItems;

    public Member(String memberId, String name, int maxAllowed) {
        setMemberId(memberId);
        setName(name);
        setMaxAllowed(maxAllowed);
        this.borrowedItems = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        if (memberId == null || memberId.trim().isEmpty()) {
            throw new IllegalArgumentException("Member ID cannot be empty.");
        }
        this.memberId = memberId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be empty.");
        }
        this.name = name.trim();
    }

    public int getMaxAllowed() {
        return maxAllowed;
    }

    public void setMaxAllowed(int maxAllowed) {
        if (maxAllowed <= 0) {
            throw new IllegalArgumentException("maxAllowed must be a positive number.");
        }
        this.maxAllowed = maxAllowed;
    }

    public List<LibraryItem> getBorrowedItems() {
        return Collections.unmodifiableList(borrowedItems);
    }

    public int getBorrowedCount() {
        return borrowedItems.size();
    }

    public boolean canBorrowMore() {
        return borrowedItems.size() < maxAllowed;
    }

    public void addBorrowedItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public boolean holdsItem(String itemId) {
        for (LibraryItem item : borrowedItems) {
            if (item.getId().equalsIgnoreCase(itemId)) {
                return true;
            }
        }
        return false;
    }
}
