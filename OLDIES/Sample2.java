package OLDIES;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Wetpakner
 */
public class Sample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int size;
        
        System.out.println("Welcome to the Masterlist of GOATS241B!");
        System.out.println("List all of the Goats of the world in this list.");
        
        // enter the size of the array (list)
        do {
            System.out.print("\nEnter the size of the list: ");
            size=in.nextInt();
            
            if (size<=0) {
                System.out.println("Enter number GREATER than 0!");
            }
        } while (size<=0);
        
        // goat list of array
        String names[]=new String[size];
        int choice, count=0;
        
        // register the goats
        System.out.println("");
        for (int x = 0; x < size; x++) {
            System.out.print("Enter name at index "+x+": ");
            names[x]=in.next();
            count++;
        }
        
        // program
        do {
            System.out.println("\n----------O P T I O N----------");
            System.out.println("1. Display");
            System.out.println("2. Sort");
            System.out.println("3. Search");
            System.out.println("4. Performance");
            System.out.println("5. Exit");
            System.out.println("-------------------------------");
            
            System.out.print("Enter your choice (1-5): ");
            choice=in.nextInt();
            System.out.println("");
            
            // options
            switch (choice) {
                // display the names of the goats
                case 1:
                    for (int x = 0; x < size; x++) {
                        System.out.println("-"+names[x]);
                    }
                break;
                
                // sort the names into alphabetical order
                case 2:
                    Arrays.sort(names);
                    for (String x : names) {
                        System.out.println("-"+x);
                    }
                break;
                
                // search for a goat
                case 3:
                    System.out.print("Search: ");
                    String searchname=in.next();
                    int cout=0;
                    boolean foundname=false;
                    
                    int x=0;
                    for (; x<size; x++) {
                        if (searchname.equalsIgnoreCase(names[x])) {
                            foundname=true;
                            break;
                        }
                    }
                    for (String y : names) {
                        if (!searchname.equalsIgnoreCase(y)) {
                            continue;
                        }
                        cout++;
                    }
                    
                    if (foundname) {
                        System.out.println("There is "+cout+" in the list! "+searchname+" is found at index "+x+"!");
                    } else {
                        System.out.println("There is "+cout+" in the list! "+searchname+" is not found!");
                    }
                break;
                
                // show the performance of the goats
                case 4:
                    for (String y : names) {
                        System.out.println(y+" contributed "+(int)(Math.random()*101)+"% to the world.");
                    }
                break;
                
                // leave the program
                case 5:
                    System.out.println("Exiting program....");
                break;
                
                // reject when the input choice is invalid
                default:
                    System.out.println("Invalid Choice!!");
            }
        } while (choice!=5);
        
    }
}
