
import java.util.*;  // Import of all java packages

/**
 *
 * @author RafaelKhyronB & ZamoraCharmAshleyM
 */
public class rafaelzamoraFINALS {  // Library Management System class
    
    /* ArrayList is used in this class because it is faster when it comes to 
    searching, accessing of elements, and iteration. It has lesser memory usage
    compared to LinkedList. Also, Library Management System mainly focuses on
    searching for books based on title, author, or ID, which makes ArrayList a
    better choice because it is much faster for searching and many more */
    
    /* Main Method */
    public static void main(String[] args) {
        /* Declaration of scanner and ArrayList */
        Scanner in=new Scanner(System.in);                   // Scanner
        ArrayList <Integer> bookID=new ArrayList <>();       // Book ID
        ArrayList <String> title=new ArrayList <>();         // Book Title
        ArrayList <String> author=new ArrayList <>();        // Book Author
        ArrayList <String> genre=new ArrayList <>();         // Book Genre
        ArrayList <Integer> year=new ArrayList <>();         // Book Year
        ArrayList <Boolean> isAvailable=new ArrayList <>();  // Availability
        
        int choice;  // Initialization of choice for user input
        
        /* Welcoming remarks to the Library Management System */
        System.out.println("------------ Welcome to Aklatan ni Juan! -----------");
        System.out.println("Buksan ang libro, buksan ang mundo! Learn from Juan!");
        
        /* Main Program for Library Management System (do-while loop) */
        do {
            /* Menu and user input for choice */
            displayMenu();                                  // Method to display Menu
            System.out.print("Enter your choice (1-6): ");  // User input for choice
            choice=in.nextInt();                            // Scanner for choice
            System.out.println("----------------------------------------------------");
            
            /* Choices (switch-case) */
            switch (choice) {
                /* Case containing method to add new book in the list */
                case 1:
                    addBook(in, bookID, title, author, genre, year, isAvailable);
                    break;  // Break line for case 1
                    
                /* Case containing method to remove a book from the list */
                case 2:
                    removeBook(in, bookID, title, author, genre, year, isAvailable);
                    break;  // Break line for case 2
                    
                /* Case containing method to update an existing book */
                case 3:
                    updateBook(in, bookID, title, author, genre, year, isAvailable);
                    break;  // Break line for case 3
                    
                /* Case containing method to search for a book */
                case 4:
                    searchBook(in, bookID, title, author, genre, year, isAvailable);
                    break;  // Break line for case 4
                    
                /* Case containing method to display all books */
                case 5:
                    displayBooks(bookID, title, author, genre, year, isAvailable);
                    break;  // Break line for case 5
                    
                /* Case to display exit message upon leaving the program */
                case 6:
                    System.out.println("Exiting program....");  
                    break;  // Break line for case 6
                    
                /* Default case to display if the entered choice is invalid */
                default:
                    System.out.println("******** Invalid choice!! Please try again! ********");
            }
        } while (choice!=6);  // Execute until the entered choice is 6 to exit
    }
        
    /* Static method to display menu */
    public static void displayMenu() {
        /* Line 81-89 displays the main menu */
        System.out.println("\n---------- LIBRARY MANAGEMENT SYSTEM MENU ----------");
        System.out.println("1. Add new book");             // Adding books
        System.out.println("2. Remove a book");            // Removing books
        System.out.println("3. Update an existing book");  // Updating books
        System.out.println("4. Search for a book");        // Searching books
        System.out.println("5. Display all books");        // Displaying all books
        System.out.println("6. Exit");                     // Exit program
        System.out.println("----------------------------------------------------");
    }
    
    /* Static method to add a book */
    public static void addBook(Scanner in, ArrayList<Integer> bookID, 
            ArrayList<String> title, ArrayList<String> author, 
            ArrayList<String> genre, ArrayList<Integer> year, 
            ArrayList<Boolean> isAvailable) {  
        
        /* Displays ADDING NEW BOOK, it is also for design */
        System.out.println("\n---------------- ADDING A NEW BOOK -----------------");
        
        /* User input for Book ID */
        System.out.print("Enter book ID: ");
        int id=in.nextInt();  // Scanner for Book ID
        in.nextLine();        // Consumes nextLine for String inputs
            
        /* If the entered bookID already exists, the program will return to the
        main method displaying "Book ID already exists!" and no book will be added */
        if (bookID.contains(id)) {                         
            System.out.println("************** Book ID already exists! *************");  
            return;  // return method to main
        } 
        
        /* If the entered bookID is 0 or a negative num, the program will return 
        to the main method displaying "Book ID must be a positive number!" and 
        no book will be added */
        if (id<1) {
            System.out.println("******** Book ID must be a positive number! ********");
            return;  // return method
        } 
          
        /* User input for Book Title */
        System.out.print("Enter book TITLE: ");
        String Title=in.nextLine();  // Scanner for Book Title        
            
        /* If the entered book Title already exists, the program will return to
        the main method displaying "Book title already exists!" and no book will 
        be added */
        for (int i=0; i<title.size(); i++) {  // for-loop for Title iteration
            if (Title.equalsIgnoreCase(title.get(i))) {  // Check if Title exists               
                System.out.println("************ Book title already exists! ************");
                return;  // return to main method if Title already exists
            }    
        }
        
        /* User input for Book Author */
        System.out.print("Enter book AUTHOR: ");
        String Author=in.nextLine();  // Scanner for Book Author
        
        /* User input for Book Genre */
        System.out.print("Enter book GENRE: ");
        String Genre=in.nextLine();  // Scanner for Book Genre
        
        /* User input for Book Year */
        System.out.print("Enter book YEAR: ");
        int yr=in.nextInt();  // Scanner for Book Year  
        
        /* If the entered book Year is 0 or a negative number, the program will 
        return to the main method displaying "Year must be a positive number!" 
        and no book will be added */
        if (yr<1) {                                                
            System.out.println("********** Year must be a positive number! *********");
            return;  // return method
        }
        
        /* User input for the Availability of the book */
        System.out.print("Enter if AVAILABLE (true or false): ");
        boolean avail=in.nextBoolean();  // Scanner for Book's Availability   
        
        /* If all conditions are met, the book will be added to the list and a
        message will appear saying "Book added successfully!" */
        bookID.add(id);          // Adds bookID to the list
        title.add(Title);        // Adds book Title to the list
        author.add(Author);      // Adds book Author to the list
        genre.add(Genre);        // Adds book Genre to the list
        year.add(yr);            // Adds book Year to the list
        isAvailable.add(avail);  // Adds book's Availability to the list
        System.out.println("------------> Book added successfully! <------------");
    }
    
    /* Static method to remove a book */
    public static void removeBook(Scanner in, ArrayList<Integer> bookID, 
            ArrayList<String> title, ArrayList<String> author, 
            ArrayList<String> genre, ArrayList<Integer> year, 
            ArrayList<Boolean> isAvailable) {
        
        /* If there are empty book in the list, the program will return to the
        main method displaying "No books available! Add books first!" */
        if (bookID.isEmpty()) {
            System.out.println("******* No books available! Add books first! *******");
            return;  // return method
        }
        
        /* Displays REMOVING A BOOK, it is also for design */
        System.out.println("\n----------------- REMOVING A BOOK ------------------");
        
        /* User input for the book you want to remove by bookID */
        System.out.print("Enter the ID of the book you want to REMOVE: ");
        int delete=in.nextInt();           // Scanner for removal
        int index=bookID.indexOf(delete);  // int variable for the indexOf inputted data
        
        /* If the book is found, the method will remove the specified book by ID,
        and a message will appear saying "Book removed successfully!". Else, it 
        will not remove any book if the bookID is not found */
        if (index!=-1) {  // If the book is found
            bookID.remove(index);       // Removes bookID
            title.remove(index);        // Removes book Title
            author.remove(index);       // Removes book Author
            genre.remove(index);        // Removes book Genre
            year.remove(index);         // Removes book Year
            isAvailable.remove(index);  // Removes book's Availability
            System.out.println("-----------> Book removed successfully! <-----------");
        } else {  // If the book is not found
            System.out.println("****************** Book not found! *****************");
        }
    }
    
    /* Static method to update the attribute of an existing book */
    public static void updateBook(Scanner in, ArrayList<Integer> bookID, 
            ArrayList<String> title, ArrayList<String> author, 
            ArrayList<String> genre, ArrayList<Integer> year, 
            ArrayList<Boolean> isAvailable) {
        
        /* If there are empty book in the list, the program will return to the
        main method displaying "No books available! Add books first!" */
        if (bookID.isEmpty()) {                                        
            System.out.println("******* No books available! Add books first! *******");
            return;  // return method
        }
        
        /* User input for the book you want to update by bookID */
        System.out.print("\nEnter the ID of the book you want to UPDATE: ");
        int update=in.nextInt();           // Scanner for update
        int index=bookID.indexOf(update);  // int variable for the indexOf inputted data
        in.nextLine();                     // Consumes nextLine for String inputs
        
        char option;  // Initialization for option of book attributes modification 
        
        /* If the book is found, the method will modify the specified attribute
        of the book. Else, there will be no modification */
        if (index!=-1) {  // If the book is found, update the book
            System.out.println("------------------ UPDATING BOOK -------------------");
            System.out.println("BOOK TITLE: "+title.get(index));  // Book Title
            System.out.println("----------------------------------------------------");
            System.out.println("A. Book ID");       // Modify bookID
            System.out.println("B. Title");         // Modify book Title
            System.out.println("C. Author");        // Modify book Author
            System.out.println("D. Genre");         // Modify book Genre
            System.out.println("E. Year");          // Modify book Year
            System.out.println("F. Availability");  // Modify book's Availability
            System.out.println("----------------------------------------------------");
            
            /* User input for the attribute you want to modify */
            System.out.print("\nEnter what you want to modify (A-F): ");
            option=in.next().toUpperCase().charAt(0);  // Scanner for option
            in.nextLine();  // Consumes nextLine for String inputs
            
            /* switch-case for options of book attributes to be modified */
            switch (option) {
                /* Case to modify bookID */
                case 'A':
                    System.out.print("->Enter NEW book ID: ");  // User input for ID
                    int id=in.nextInt();                        // Scanner for ID
                    
                    /* If the entered new ID already exists or is 0 or a negative 
                    number, the bookID will not be modified. Else, it will be 
                    modified if the conditions are met */
                    if (bookID.contains(id)) {  // If the ID already exists, break
                        System.out.println("************** Book ID already exists! *************");
                    } else if (id<1) {  // If the ID is 0 or a negative number, break
                        System.out.println("******** Book ID must be a positive number! ********");
                    } else {  // If all the conditions are met, the ID will be modified
                        bookID.set(index, id);  // Modify bookID and inform the user
                        System.out.println("---------> Book ID successfully modified! <---------");
                    }
                    break;  // Break line for case A
                    
                /* Case to modify book Title */
                case 'B':
                    System.out.print("->Enter NEW book TITLE: ");  // User input for Title
                    String Title=in.nextLine();                    // Scanner for Title
                    
                    /* If the entered new Title already exists, the book Title 
                    will not be modified and will display "Book title already exists!". 
                    Else, it will be modified */
                    for (int i=0; i<title.size(); i++) {  // for-loop for Title iteration
                        if (Title.equalsIgnoreCase(title.get(i))) {  // Check if Title exists
                            System.out.println("************ Book title already exists! ************");
                            return;  // return if the Title already exists
                        }                        
                    }
                    
                    /* If the Title does not yet exists, it will be modified */
                    title.set(index, Title);  // Modify Title and inform the user
                    System.out.println("--------> Book title successfully modified! <-------");                    
                    break;  // Break line for case B
                    
                /* Case to modify book Author */
                case 'C':
                    System.out.print("->Enter NEW book AUTHOR: ");  // Author user input
                    String Author=in.nextLine();                    // Scanner for Author
                    
                    author.set(index, Author);  // Modifies Author and displays:
                    System.out.println("-------> Book author successfully modified! <-------");
                    break;  // Break line for case C
                    
                /* Case to modify book Genre */
                case 'D':
                    System.out.print("->Enter NEW book GENRE: ");  // Genre user input
                    String Genre=in.nextLine();                    // Scanner for Genre
                    
                    genre.set(index, Genre);  // Modifies Genre and displays:
                    System.out.println("--------> Book genre successfully modified! <-------");
                    break;  // Break line for case D
                    
                /* Case to modify book Year */
                case 'E':
                    System.out.print("->Enter NEW book YEAR: ");  // Year user input
                    int yr=in.nextInt();                          // Scanner for Year
                    
                    /* If the entered new Year is 0 or a negative number, the 
                    book Year will not be modified. Else, it will be modified */
                    if (yr<1) {  // If the Year is 0 or a negative number, break
                        System.out.println("********* Year must be a positive number! **********");
                    } else {  // If all the conditions are met, Year will be modified
                        year.set(index, yr);  // Modify Year and inform the user
                        System.out.println("--------> Book year successfully modified! <--------");
                    }
                    break;  // Break line for case E
                    
                /* Case to modify book's Availability */
                case 'F':
                    /* Availability user input and scanner */
                    System.out.print("->Enter AVAILABILITY (true or false): ");
                    boolean avail=in.nextBoolean();
                    
                    /* Modifies Availability and displays message showing success */
                    isAvailable.set(index, avail);  // Modify Availability and display:
                    System.out.println("----> Book availability successfully modified! <----");
                    break;  // Break line for case F
                    
                /* Default case to display if the entered option is invalid */
                default:
                    System.out.println("***** Invalid choice!! No attributes modified! *****");
            }
        } else {  // If the book is not found, display "Book not found!"
            System.out.println("****************** Book not found! *****************");
        }
    }
    
    /* Static method to search for a book */
    public static void searchBook(Scanner in, ArrayList<Integer> bookID, 
            ArrayList<String> title, ArrayList<String> author, 
            ArrayList<String> genre, ArrayList<Integer> year, 
            ArrayList<Boolean> isAvailable) {
        
        /* If there are empty book in the list, the program will return to the
        main method displaying "No books available! Add books first!" */
        if (bookID.isEmpty()) { 
            System.out.println("******* No books available! Add books first! *******");
            return;  // return method
        }
        
        /* User input for the book you want to search by ID */
        System.out.print("\nEnter the ID of the book you want to SEARCH: ");
        int search=in.nextInt();           // Scanner for search
        int index=bookID.indexOf(search);  // int variable for the indexOf inputted data
        
        /* If the book is found, the method will display the details about the
        book. Else, it will display "Book not found" */
        if (index!=-1) {  // If the book is found
            System.out.println("------------------- BOOK FOUND: --------------------");
            System.out.println("======= "+title.get(index)+" =======");    // Book Title
            System.out.println("Book ID    :  "+bookID.get(index));        // Book ID
            System.out.println("Author     :  "+author.get(index));        // Book Author
            System.out.println("Genre      :  "+genre.get(index));         // Book Genre
            System.out.println("Year       :  "+year.get(index));          // Book Year
            System.out.println("Available  :  "+isAvailable.get(index));   // Availability
            System.out.println("----------------------------------------------------");
        } else {  // If the book is not found
            System.out.println("****************** Book not found! *****************");
        }
    }
    
    /* Static method to display all books */
    public static void displayBooks(ArrayList<Integer> bookID, 
            ArrayList<String> title, ArrayList<String> author, 
            ArrayList<String> genre, ArrayList<Integer> year, 
            ArrayList<Boolean> isAvailable) {
        
        /* If there are empty book in the list, the program will return to the
        main method displaying "No books available! Add books first!" */
        if (bookID.isEmpty()) {
            System.out.println("******* No books available! Add books first! *******");
        } else {  // Else, if the list contains book(s) 
            for (int i=0; i<bookID.size(); i++) {  // for-loop to display book details
                System.out.println("\n------------------- BOOK DETAILS -------------------");
                System.out.println("======= "+title.get(i)+" =======");   // Book Title
                System.out.println("Book ID    :  "+bookID.get(i));       // Book ID         
                System.out.println("Author     :  "+author.get(i));       // Book Author
                System.out.println("Genre      :  "+genre.get(i));        // Book Genre
                System.out.println("Year       :  "+year.get(i));         // Book Year
                System.out.println("Available  :  "+isAvailable.get(i));  // Availability
                System.out.println("----------------------------------------------------");
            }  
        }
    }
}
