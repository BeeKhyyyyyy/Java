
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class abu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice;
        
        // Main program
        do {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            choice=in.nextInt();
            System.out.println("");
            
            switch (choice) {
                // calculating sum of 2 numbers
                case 1:
                    calculateSum(in);
                    break;
                    
                // finding the highest number among 3 numbers
                case 2:
                    findMax(in);
                    break;
                    
                // display message
                case 3:
                    displayMessage();
                    break;
                    
                // leave the program
                case 4:
                    System.out.println("Exiting program....");
                    break;
                    
                // invalid choice entered
                default:
                    System.out.println("Invalid choice!!");
            }            
        } while (choice!=4);        
    }
    
    // static method to display menu
    public static void displayMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Calculate Sum");
        System.out.println("2. Find Maximum");
        System.out.println("3. Display Message");
        System.out.println("4. Exit");
        System.out.println("==========================");
    }
    
    // static method to calculate the sum
    public static void calculateSum(Scanner in) {
        System.out.print("Enter num1: ");
        int num1=in.nextInt();
        System.out.print("Enter num2: ");
        int num2=in.nextInt();
        
        int sum=num1+num2;
        System.out.println("Sum: "+sum);
    }
    
    // static method to find the maximum number
    public static void findMax(Scanner in) {
        System.out.print("Enter num1: ");
        int num1=in.nextInt();
        System.out.print("Enter num2: ");
        int num2=in.nextInt();
        System.out.print("Enter num3: ");
        int num3=in.nextInt();
        
        int max=(num1>num2 && num1>num3) ? num1 : (num2>num3) ? num2 : num3;
        System.out.println("Maximum number: "+max);
    }
    
    // static method to display message
    public static void displayMessage() {
        System.out.println("PADAYONN!! Makaka-kwatro, consistent Dean's List "
                + "1st Honor, at Summa Cum Laude ka! Higit sa lahat, "
                + "maaaccomplish mo lahat ng goal mo at matutupad lahat ng "
                + "pangarap mo. Laban langg!!");
    }
}
