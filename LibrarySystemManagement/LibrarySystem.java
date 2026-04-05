
package LibrarySystemManagement;

import java.util.*;

// Interface Person
interface Person {
    String getName();   // Public and abstract by default
}

// Interface Borrowable
interface Borrowable {
    void CheckOut(User user);   // Public and abstract by default
    void ReturnItem();
}

// Interface User extending Person
interface User extends Person {
    void BorrowItem(Borrowable item);   // Public and abstract by default
    void ReturnItem(Borrowable item);
}

// Abstract class LibraryItem implementing Borrowable interface
abstract class LibraryItem implements Borrowable {
    // Private fields of LibraryItem
    private String title;
    private boolean isCheckedOut;
    
    // Constructor for LibraryItem
    LibraryItem(String title) {
        this.title=title;
        this.isCheckedOut=false;
    }
    
    // Abstract method to be implemented by the subclasses of LibraryItem
    abstract void GetAdditionalInfo();
    
    // Public method to get the title of LibraryItem items
    public String getTitle() {
        return title;
    }
    
    // Public method to check the checked-out status of the items
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    
    // Overriden abstract method from Borrowable to check-out items
    @Override
    public void CheckOut(User user) {
        if (isCheckedOut) {
            System.out.println(title + " is already checked out.");
        } else {
            isCheckedOut=true;
            System.out.println(user.getName() + " checked out: " + title);
            GetAdditionalInfo();
        }
    }
    
    // Overriden abstract method from Borrowable to return items
    @Override
    public void ReturnItem() {
        if (!isCheckedOut) {
            System.out.println(title + " was not checked out.");
        } else {
            isCheckedOut=false;
            System.out.println("Item returned: " + title);
        }
    }
}

// Concrete class Book extending LibraryItem
class Book extends LibraryItem {
    private String author;   // Private field of Book (author)
    
    // Constructor for Book
    Book(String title, String author) {
        super(title);
        this.author=author;
    }
    
    // Overriden abstract method from LibraryItem to get the additional info (author) of the item
    @Override
    public void GetAdditionalInfo() {
        System.out.println("Author: " + author);
    }
}

// Concrete class DVD extending LibraryItem
class DVD extends LibraryItem {
    private String director;   // Private field of DVD (director)
    
    // Constructor for DVD
    DVD(String title, String director) {
        super(title);
        this.director=director;
    }
    
    // Overriden abstract method from LibraryItem to get the additional info (director) of the item
    @Override
    public void GetAdditionalInfo() {
        System.out.println("Director: " + director);
    }
}

// Concrete class LibraryUser implementing User interface
class LibraryUser implements User {
    // Private fields of LibraryUser
    private String name;
    private List<Borrowable> borrowedItems;
    
    // Constructor for LibraryUser
    LibraryUser(String name) {
        this.name=name;
        this.borrowedItems=new ArrayList<>();
    }
    
    // Overriden abstract method from Person inherited by User to get the user's name
    @Override
    public String getName() {
        return name;
    }
    
    // Overriden abstract method from User to borrow items
    @Override
    public void BorrowItem(Borrowable item) {
        item.CheckOut(this);
        borrowedItems.add(item);
    }
    
    // Overriden abstract method from User to return items
    @Override
    public void ReturnItem(Borrowable item) {
        item.ReturnItem();
        borrowedItems.remove(item);
    }
}

// LibrarySystem class (Menu-Driven interface)
public class LibrarySystem {
    // Initializing scanner class
    private static Scanner in=new Scanner(System.in);
    
    // Initializing instances/objects of library items
    private static Book book=new Book("Intro to OOP", "J. Doe");
    private static DVD dvd=new DVD("Scary Movie 10", "Steve Rowling");
    private static List<LibraryItem> items = Arrays.asList(book, dvd);
    
    // Initializing an instance/object of library user
    private static LibraryUser user=new LibraryUser("Juan dela Cruz");
    
    // Main method to test the program
    public static void main(String[] args) {
        // Do-while loop to run the program continuously
        int choice;
        do {
            // Menu and user interface
            choice=menu();
            System.out.println("");
            
            // Switch-case containing each option to:
            switch (choice) {
                case 1:   // Option 1 to display available items
                    displayAvailableItems();
                    break;
                
                case 2:   // Option 2 to borrow items
                    borrowItem();
                    break;
                
                case 3:   // Option 3 to return items
                    returnItem();
                    break;
                
                case 4:   // Option 4 to exit the program
                    System.out.println("Program terminated.");
                    break;
                
                default:   // Default case in case there is an invalid choice
                    System.out.println("Invalid choice. Try again.");
                    System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            }
        } while (choice != 4);   // The program will run as long as the choice is not 4
    }
    
    // Public static method to show the menu and user interface
    public static int menu() {
        System.out.println("Library System Menu:");
        System.out.println("1. Display available items");
        System.out.println("2. Borrow an item");
        System.out.println("3. Return an item");
        System.out.println("4. Quit");
        System.out.print("Enter your choice (1-4): ");
        while (!in.hasNextInt()) {   // Handles error when a String/char is entered
            System.out.print("Invalid choice. Please enter a number: ");
            in.next();
        }
        return in.nextInt();
    }
    
    // Public static method to show the available items
    public static void displayAvailableItems() {
        for (LibraryItem item : items) {   // For-each loop to display the available items
            if (!item.isCheckedOut()) {
                System.out.print(item instanceof Book ? "Book Title: " : "DVD Title: ");
                System.out.print(item.getTitle() + ", ");
                item.GetAdditionalInfo();                
            }
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
    
    // Public static method to display the borrow items menu/user interface
    public static void borrowItem() {
        System.out.print("Enter the item number to borrow (1 for Book, 2 for DVD): ");
        while (!in.hasNextInt()) {   // Handles error when a String/char is entered
            System.out.print("Invalid choice. Please enter a number: ");
            in.next();
        }
        int borrowChoice = in.nextInt();
        
        if (borrowChoice == 1) {   // Will execute BorrowItem(book) if the chosen option is 1
            user.BorrowItem(book);
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        } else if (borrowChoice == 2) {   // Will execute BorrowItem(dvd) if the chosen option is 2
            user.BorrowItem(dvd);
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        } else {   // Will execute if none of the options are chosen or if the choice is invalid
            System.out.println("Invalid choice or item already checked out.");
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        }
    }
    
    // Public static method to display the return items menu/user interface
    public static void returnItem() {
        System.out.print("Enter the item number to return (1 for Book, 2 for DVD): ");
        while (!in.hasNextInt()) {   // Handles error when a String/char is entered
            System.out.print("Invalid choice. Please enter a number: ");
            in.next();
        }
        int returnChoice = in.nextInt();        
        
        if (returnChoice == 1) {   // Will execute ReturnItem(book) if the chosen option is 1
            user.ReturnItem(book);
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        } else if (returnChoice == 2) {   // Will execute ReturnItem(dvd) if the chosen option is 2
            user.ReturnItem(dvd);
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        } else {   // Will execute if none of the options are chosen or if the choice is invalid
            System.out.println("Invalid choice or item is not checked out.");
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        }
    }
}
