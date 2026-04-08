package OLDIES;

import java.util.Scanner;

/**
 * 
 * @author Wetpakner
 */
public class Sample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // The legendary school
        System.out.println("Welcome to Kupal Academy!");
        System.out.println("The school where LEGENDS arise.");
        
        // Variables
        String enroll, sex, name, location, birthplace, birthday, program, year;
        int taon;
        
        // The birth of a legend
        do {
            System.out.print("\nDo you want to enroll (Yes or No)? ");
            enroll=in.nextLine();
            
            if (!enroll.equalsIgnoreCase("yes") && !enroll.equalsIgnoreCase("no")) {
                System.out.println("Please enter YES or NO only!");
            }
        } while (!enroll.equalsIgnoreCase("yes") && !enroll.equalsIgnoreCase("no"));
        
        if (enroll.equalsIgnoreCase("no")) {
            System.out.println("We look forward to your next visit!");
        }  else {
            // Sex
            do {
                System.out.print("\nAre you a Male or a Female? ");
                sex=in.nextLine();
                
                if (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female")) {
                    System.out.println("Please enter the appropriate choice!");
                }
            } while (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female"));
                
            // Name
            System.out.print("What's your name? ");
            name=in.nextLine();
                
            // Location/Address
            System.out.print("Enter your location: ");
            location=in.nextLine();
                
            // Birthplace
            System.out.print("Enter your birthplace: ");
            birthplace=in.nextLine();
                
            // Birthday
            System.out.print("Enter your birthday: ");
            birthday=in.nextLine();
                
            // Program
            System.out.print("Enter your desired program: ");
            program=in.nextLine();
                
            // Year
            do {
                System.out.print("Enter your year (1-4):");
                year=in.nextLine();
                    
                taon=Integer.parseInt(year);
                if (taon<1 || taon>4) {
                    System.out.println("Please enter a valid year!\n");
                }
            } while (taon<1 || taon>4);
            
            // COR
            System.out.println("\n\n\tC E R T I F I C A T E  O F  R E G I S T R A T I O N");
            System.out.println("Name:\t\t"+name);
            System.out.println("Sex:\t\t"+sex);
            System.out.println("Address:\t"+location);
            System.out.println("Birthday:\t"+birthday);
            System.out.println("Birthplace:\t"+birthplace);
            System.out.println("Program:\t"+program);
            switch (taon) {
                case 1:
                    System.out.println("Year:\t\t"+year+"st Year");
                    break;
                    
                case 2:
                    System.out.println("Year:\t\t"+year+"nd Year");
                    break;
                    
                case 3:
                    System.out.println("Year:\t\t"+year+"rd Year");
                    break;
                    
                default:
                    System.out.println("Year:\t\t"+year+"th Year");
            }
            System.out.println("\nYou are now officially enrolled! Thank you for choosing us!!");
        }
        
    }
}    