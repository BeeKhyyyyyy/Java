package walalang;


import java.time.Year;

// Class named Book
class Book {
    // Private attributes (fields)
    private String title, author;
    private int yearPublished;
    
    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
    }
    
    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title=title;
        System.out.println("Title successfully modified!");
    }
    
    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author=author;
        System.out.println("Author successfully modified!");
    }
    
    // Getter and Setter for yearPublished
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished=yearPublished;
        System.out.println("Year Published successfully modified!");
    }
    
    // Method to calculate the age of the book
    public int CalculateAge() {
        int currentYear=Year.now().getValue();
        return currentYear-yearPublished;
    }
    
    // Method to print book information
    public void PrintBookInfo() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year Published: "+yearPublished);
        System.out.println("Book Age: "+CalculateAge()+" years");
    }
}

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // Creating 2 objects of the Book class with initial details        
        Book book1=new Book("The Lord of the Rings", "John Ronald Reuel Tolkien", 1954);
        Book book2=new Book("A Game of Thrones", "George R. R. Martin", 1996);
        
        // Displaying book1 details using Getter and PrintBookInfo() method
        System.out.println("==================== Book1 ====================");
        System.out.println("Title (via getter): "+book1.getTitle());
        System.out.println("Author (via getter): "+book1.getAuthor());
        System.out.println("Year Published (via getter): "+book1.getYearPublished());
        book1.PrintBookInfo();
        System.out.println("===============================================\n");
        
        // Updating book2 details using Setter
        book2.setTitle("Bridge to Terabithia");
        book2.setAuthor("Katherine Paterson");
        book2.setYearPublished(1977);
        System.out.println("");
        
        // Displaying book2 details using Getter and PrintBookInfo() method
        System.out.println("==================== Book2 ====================");
        System.out.println("Title (via getter): "+book2.getTitle());
        System.out.println("Author (via getter): "+book2.getAuthor());
        System.out.println("Year Published (via getter): "+book2.getYearPublished());
        book2.PrintBookInfo();
        System.out.println("===============================================");
    }
}
