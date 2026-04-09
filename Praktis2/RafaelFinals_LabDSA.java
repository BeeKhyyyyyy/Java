
import java.util.*;

// Hash-Based Book Management System using Chaining
public class RafaelFinals_LabDSA {
    
    // Hash table size and initialization as LinkedList
    private static final int SIZE=10;
    private static LinkedList<Integer>[] hashTable;
    
    // Initialize hash table and each index as a new LinkedList
    static {
        hashTable=new LinkedList[SIZE];
        for (int i=0; i<SIZE; i++) {
            hashTable[i]=new LinkedList<>();
        }
    }

    // Public hash function method to compute hash value of the Book ID
    public static int hashFunction(int bookId) {
        return bookId % SIZE;
    }

    // Public method to insert a Book ID
    public static void insertBook(int bookId) {
        int index=hashFunction(bookId);  // Stores Book ID computed index through hashFunction method
        LinkedList<Integer> bucket=hashTable[index];  // Stores each hash table index

        if (!bucket.isEmpty()) {  // If the index has value, inform the user a collision occured
            System.out.println("Collision detected at index " + index + "!");
        }

        bucket.add(bookId);  // Adds Book ID(s)
        System.out.println("Book ID: " + bookId + " inserted successfully at index " + index + ".");
    }

    // Public method to display the hash table
    public static void displayTable() {
        System.out.println("Current Hash Table:");
        System.out.println("------------------------------");
        for (int i=0; i<SIZE; i++) {  // For-loop to display Book ID values of each index
            System.out.print("Index " + i + ": ");
            if (hashTable[i].isEmpty()) {  // If the index is empty, display none
                System.out.println("[]");
            } else {  // Else, display the values
                System.out.println(hashTable[i]);
            }
        }
        System.out.println("------------------------------");
    }

    // Public method to search for a Book
    public static void searchBook(int bookId) {
        int index=hashFunction(bookId);  // Stores Book ID computed index through hashFunction method
        LinkedList<Integer> bucket=hashTable[index];  // Stores each hash table index

        if (bucket.contains(bookId)) {  // If the index contains the specified Book ID, inform the user
            System.out.println("Book ID: " + bookId + " found at index " + index + ".");
        } else {  // Else, inform the user that the Book is not found
            System.out.println("Book ID: " + bookId + " not found.");
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);  // Initialize scanner
        String choice;  // Variable to store user's choice
        
        do {  // Menu-driven interface
            System.out.println("=== NU Laguna Library Book Management System ===");
            System.out.println("1. Insert Book ID(s)");
            System.out.println("2. Display Hash Table");
            System.out.println("3. Search for a Book ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice=in.nextLine();  // User input for choice
            System.out.println("");

            // Switch-case for the options
            switch (choice) {
                case "1":  // Insertion option
                    System.out.print("Enter Book IDs (e.g., 1, 2, 3): ");
                    String[] ids=in.nextLine().split(",");  // Stores the inputted values
                    for (String id : ids) {  // For-each loop with try-catch to store the values
                        try {  // If the value is an int after parsing and trimming, insert it
                            int bookId=Integer.parseInt(id.trim());
                            insertBook(bookId);
                        } catch (NumberFormatException e) {  // Else, don't store it and inform the user
                            System.out.println("Invalid Book ID: " + id);
                        }
                    }
                    break;

                case "2":  // Display table option
                    displayTable();
                    break;

                case "3":  // Searching option
                    System.out.print("Enter Book ID to search: ");
                    try {  // If the target value is an int, find the Book ID
                        int bookId=Integer.parseInt(in.nextLine());
                        searchBook(bookId);
                    } catch (NumberFormatException e) {  // Else, don't find it and inform the user
                        System.out.println("Invalid input! Please enter a number.");
                    }
                    break;

                case "4":  // Exit option
                    System.out.print("Exiting system....");
                    break;

                default:   // Execute if the choice is invalid
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println("");
        } while (!choice.equals("4"));  // Run the program while the choice is not 4 (exit)
    }
}
