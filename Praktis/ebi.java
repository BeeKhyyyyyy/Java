
import java.util.*;

// Class named Phone
class Phone {
    // Attributes (fields)
    String brand, model;
    boolean power, charge;
    
    // Constructor (to initialize objects)
    Phone (String b, String m) {
        brand=b;
        model=m;
    }
    
    // Public method to display the details of the Phone
    void showDetails() {
        System.out.println("\n***** Phone Details *****");
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
    
    // Public method to turn off the Phone
    void turnOff() {
        if (power==true) {
            power=false;
            System.out.println("\nThe device has been turned off.");
        } else {
            System.out.println("\nThe device is already turned off.");
        }
    }
    
    // Public method to turn on the Phone
    void turnOn() {
        if (power==false) {
            power=true;
            System.out.println("\nThe device has been turned on.");
        } else {
            System.out.println("\nThe device is already turned on.");
        }
    }
    
    // Public method to charge the Phone
    void connectCharger() {
        if (charge==false) {
            charge=true;
            System.out.println("\nThe device is charging.");
        } else {
            System.out.println("\nThe device is already charging.");
        }
    }
    
    // Public method to disconnect the Phone from charging
    void disconnectCharger() {
        if (charge==true) {
            charge=false;
            System.out.println("\nThe device is not charging.");
        } else {
            System.out.println("\nThe device is already not charging.");
        }
    }
}

// Main class
public class ebi {
    // Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);   // Scanner class
        int choice;   // Option for the do-while loop
        
        // Input for Phone brand and model
        System.out.print("Enter phone brand: ");
        String brand=in.nextLine();
        System.out.print("Enter phone model: ");
        String model=in.nextLine();
        
        // Creating an object of the Phone class
        Phone cp=new Phone(brand, model);
        
        // Main program for the Phone
        do {
            // Option of the Program
            choice=menu(in);
            
            // Options
            switch (choice) {
                // Case to show the details of the device
                case 1:
                    cp.showDetails();;
                break;
                
                // Case to turn on the device
                case 2:
                    cp.turnOn();
                break;
                
                // Case to turn off the device
                case 3:
                    cp.turnOff();
                break;
                
                // Case to charge the device
                case 4:
                    cp.connectCharger();
                break;
                
                // Case to disconnect the device from charging
                case 5:
                    cp.disconnectCharger();
                break;
                
                // Case to exit the program
                case 6:
                    System.out.println("\nExiting program....");
                break;
                
                // Case if the entered choice is invalid
                default:
                    System.out.println("\nInvalid choice!!");
            }            
        } while (choice!=6);   // Exits the program if the entered choice is 6
    }
    
    // Public method to show the options
    public static int menu(Scanner in) {
        System.out.println("\n============ OPTIONS ============");
        System.out.println("1. Show phone details");
        System.out.println("2. Turn on the device");
        System.out.println("3. Turn off the device");
        System.out.println("4. Charge the device");
        System.out.println("5. Disconnect the device");
        System.out.println("6. Exit");
        System.out.println("=================================");
        System.out.print("What do you want to do? (1-6): ");
        return in.nextInt();
    }
}
