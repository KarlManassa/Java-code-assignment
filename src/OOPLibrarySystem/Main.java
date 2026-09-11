package OOPLibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Enter choice: ");
            String input = scanner.nextLine().trim();

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 10.");
                continue;
            }

            switch (choice) {
                case 1:
                    addItemMenu(library, scanner);
                    break;
                case 2:
                    addMemberMenu(library, scanner);
                    break;
                case 3:
                    borrowItemMenu(library, scanner);
                    break;
                case 4:
                    returnItemMenu(library, scanner);
                    break;
                case 5:
                    library.listCatalog();
                    break;
                case 6:
                    library.printReport();
                    break;
                case 7:
                    System.out.print("Enter title search keyword: ");
                    String keyword = scanner.nextLine();
                    library.searchByTitle(keyword);
                    break;
                case 8:
                    library.listAvailableItems();
                    break;
                case 9:
                    System.out.println("Program terminated. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Choose option 1-9.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("===== Library Lending System =====");
        System.out.println("1. Add Item");
        System.out.println("2. Add Member");
        System.out.println("3. Borrow Item");
        System.out.println("4. Return Item");
        System.out.println("5. List Catalog");
        System.out.println("6. Report");
        System.out.println("7. Search Item by Title");
        System.out.println("8. List Available Items Only");
        System.out.println("9. Exit");
    }

    private static void addItemMenu(Library library, Scanner scanner) {
        try {
            System.out.println("Select type (1: Book, 2: Magazine, 3: DVD): ");
            int type = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Enter title: ");
            String title = scanner.nextLine();

            switch (type) {
                case 1:
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter pages: ");
                    int pages = Integer.parseInt(scanner.nextLine().trim());
                    library.addItem(new Book(title, author, pages));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter issue number: ");
                    int issueNumber = Integer.parseInt(scanner.nextLine().trim());
                    library.addItem(new Magazine(title, issueNumber));
                    System.out.println("Magazine added successfully!");
                    break;
                case 3:
                    System.out.print("Enter runtime minutes: ");
                    int runtime = Integer.parseInt(scanner.nextLine().trim());
                    library.addItem(new DVD(title, runtime));
                    System.out.println("DVD added successfully!");
                    break;
                default:
                    System.out.println("Invalid item type!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input error: Expected a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding item: " + e.getMessage());
        }
    }

    private static void addMemberMenu(Library library, Scanner scanner) {
        try {
            System.out.print("Enter member ID (e.g. M1): ");
            String id = scanner.nextLine();
            System.out.print("Enter member name: ");
            String name = scanner.nextLine();
            System.out.print("Enter max allowed items: ");
            int max = Integer.parseInt(scanner.nextLine().trim());

            library.addMember(new Member(id, name, max));
            System.out.println("Member added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Input error: Max allowed must be an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding member: " + e.getMessage());
        }
    }

    private static void borrowItemMenu(Library library, Scanner scanner) {
        System.out.print("Member id: ");
        String memberId = scanner.nextLine();
        System.out.print("Item id: ");
        String itemId = scanner.nextLine();

        try {
            library.borrowItem(memberId, itemId);
        } catch (LibraryException e) {
            System.out.println("Could not borrow: " + e.getMessage());
        }
    }

    private static void returnItemMenu(Library library, Scanner scanner) {
        System.out.print("Member id: ");
        String memberId = scanner.nextLine();
        System.out.print("Item id: ");
        String itemId = scanner.nextLine();

        try {
            library.returnItem(memberId, itemId);
        } catch (LibraryException e) {
            System.out.println("Could not return: " + e.getMessage());
        }
    }
}