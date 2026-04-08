
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Initialization
        String names[]=new String[5];
        String choice;
        
        // Welcome
        System.out.println("Welcome to BagayTAYO!");
        System.out.println("See who MATCHES you the MOST.");
        
        // Enter your LOVEYDOVEY
        System.out.println("\nPlease enter your 5 most admired/loved person: ");
        for (int x=0; x<names.length; x++) {
            System.out.print("");
                String person=in.nextLine();
            names[x]=person;
        }
        
        // Program
        do {
            // Options
            System.out.println("\n***********O P T I O N S***********");
            System.out.println("-Display");
            System.out.println("-Search");
            System.out.println("-MATCH");
            System.out.println("-Exit");
            System.out.println("***********************************");
            
            // Choice Input
            System.out.print("Enter your choice: ");
                choice=in.nextLine();
            System.out.println("");
            
            // Choices
            switch (choice.toLowerCase()) {
                // Display the Entered People
                case "display":
                    for (int x=0; x<names.length; x++) {
                        System.out.println(names[x]);
                    }
                break;
                
                // Search for your CRUSH/LOVE
                case "search":
                    System.out.print("Search for an entered person: ");
                    String search=in.nextLine();
                    boolean found=false;
                    
                    for (int x=0; x<names.length; x++) {
                        if (search.equalsIgnoreCase(names[x])) {
                            found=true;
                            break;
                        }
                    }
                    
                    if (found) {
                        System.out.println(search+" is found!");
                    } else {
                        System.out.println(search+" is not found!");
                    }
                break;
                
                // Know who you MATCH MOST
                case "match":
                    for (int x=0; x<names.length; x++) {
                        System.out.println(names[x]+" = "+(int)(Math.random()*101)+"%");
                    }
                break;
                
                // Exit
                case "exit":
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Choice
                default:
                    System.out.println("Invalid Choice!!");
            }
        } while (!choice.equalsIgnoreCase("exit")); 
    }
}
