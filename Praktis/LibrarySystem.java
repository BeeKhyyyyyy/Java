import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface Person
interface Person {
    String getName();
}

// Interface Borrowable
interface Borrowable {
    void checkOut(User user);
    void returnItem();
}

// Interface User extends Person
interface User extends Person {
    void borrowItem(Borrowable item);
    void returnItem(Borrowable item);
}

// Abstract Class LibraryItem implements Borrowable
abstract class LibraryItem implements Borrowable {
    private String title;
    private boolean isCheckedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut(User user) {
        if (isCheckedOut) {
            System.out.println("The item is already checked out.");
        } else {
            isCheckedOut = true;
            System.out.println(user.getName() + " borrowed: " + title);
        }
    }

    public void returnItem() {
        if (!isCheckedOut) {
            System.out.println("This item was not checked out.");
        } else {
            isCheckedOut = false;
            System.out.println("The item has been returned.");
        }
    }

    // Abstract method for subclass-specific details
    public abstract void getAdditionalInfo();
}

// Concrete Class Book extends LibraryItem
class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("Author: " + author);
    }
}

// Concrete Class DVD extends LibraryItem
class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    public void getAdditionalInfo() {
        System.out.println("Director: " + director);
    }
}

// Concrete Class LibraryUser implements User
class LibraryUser implements User {
    private String name;
    private List<Borrowable> borrowedItems;

    public LibraryUser(String name) {
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void borrowItem(Borrowable item) {
        item.checkOut(this);
        borrowedItems.add(item);
    }

    @Override
    public void returnItem(Borrowable item) {
        item.returnItem();
        borrowedItems.remove(item);
    }

    public List<Borrowable> getBorrowedItems() {
        return borrowedItems;
    }
}

// Main Library System Class
public class LibrarySystem {

    private static Scanner scanner = new Scanner(System.in);
    private static List<LibraryItem> items = new ArrayList<>();
    private static LibraryUser user;

    public static void main(String[] args) {
        // Initialize library items
        items.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new DVD("Inception", "Christopher Nolan"));
        items.add(new Book("1984", "George Orwell"));
        items.add(new DVD("The Matrix", "Wachowski Brothers"));

        // Initialize user
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        user = new LibraryUser(userName);

        // Menu-driven system
        boolean running = true;
        while (running) {
            System.out.println("\n--- Library System ---");
            System.out.println("1. Display available items");
            System.out.println("2. Borrow an item");
            System.out.println("3. Return an item");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = getValidInput();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAvailableItems();
                    break;
                case 2:
                    borrowItem();
                    break;
                case 3:
                    returnItem();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display available library items
    public static void displayAvailableItems() {
        System.out.println("\nAvailable items:");
        for (LibraryItem item : items) {
            if (!item.isCheckedOut()) {
                System.out.println("- " + item.getTitle());
            }
        }
    }

    // Borrow an item
    public static void borrowItem() {
        System.out.print("Enter the title of the item you want to borrow: ");
        String title = scanner.nextLine();
        LibraryItem itemToBorrow = findItemByTitle(title);
        if (itemToBorrow != null) {
            user.borrowItem(itemToBorrow);
        } else {
            System.out.println("Item not found or already checked out.");
        }
    }

    // Return an item
    public static void returnItem() {
        System.out.print("Enter the title of the item you want to return: ");
        String title = scanner.nextLine();
        LibraryItem itemToReturn = findItemByTitle(title);
        if (itemToReturn != null && user.getBorrowedItems().contains(itemToReturn)) {
            user.returnItem(itemToReturn);
        } else {
            System.out.println("Item not found in your borrowed list.");
        }
    }

    // Find an item by title
    public static LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Valid input for menu options
    public static int getValidInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
