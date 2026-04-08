
package OLDIES;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class KEKE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // size of the array
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size=in.nextInt();
            
            // reject if size is less than 1
            if (size<1) { 
                System.out.println("Size must be GREATER than 0!\n");
            }
        } while (size<1);
        
        // elements of the array
        Integer [] num=new Integer[size];
        for (int x=0; x<size; x++) {
            System.out.print("Enter num at index "+x+": ");
            num[x]=in.nextInt();
        }
        
        // main program
        int choice;
        do {
            System.out.println("\n**********M E N U**********");
            System.out.println("1. Display");
            System.out.println("2. Search");
            System.out.println("3. Sort");
            System.out.println("4. Descending Order");
            System.out.println("5. Highest");
            System.out.println("6. Lowest");
            System.out.println("7. Sum or Product");
            System.out.println("8. Exit");
            System.out.println("***************************");
            System.out.print("Enter your choice (1-8): ");
            choice=in.nextInt();
            System.out.println("");
            
            // choices case-switch
            switch (choice) {
                // display elements of the array
                case 1:
                    for (int x=0; x<size; x++) {
                        System.out.println("Element at index "+x+": "+num[x]);
                    }
                break;
                
                // search for an element
                case 2:
                    System.out.print("Search element: ");
                    int search=in.nextInt();
                    int count=0, y=0;
                    boolean found=false;
                    
                    for (; y<size; y++) {
                        if (search==num[y]) {
                            found=true;
                            count++;
                            break;
                        }
                    }
                    
                    if (found) {
                        System.out.println("There is "+count+" in the list! "+search+" is found at index "+y+"!");
                    } else {
                        System.out.println("There is "+count+" in the list! "+search+" is not found!");
                    }
                break;
                
                // sort the elements from highest to lowest
                case 3:
                    Arrays.sort(num);
                    System.out.println("Sorted Array:");
                    for (int x=0; x<size; x++) {
                        System.out.println("Element at index "+x+": "+num[x]);
                    }
                break;
                
                // sort in descending order
                case 4:
                    Arrays.sort(num, Collections.reverseOrder());
                    System.out.println("Sorted Array in Descending Order:");
                    for (int x=0; x<size; x++) {
                        System.out.println("Element at index "+x+": "+num[x]);
                    }
                break;
                
                // find the highest value
                case 5:
                    int max=num[0];
                    for (int x : num) {
                        if (x>max) {
                            max=x;
                        }
                    }
                    System.out.println("Highest Number: "+max);
                break;
                
                // find the lowest value
                case 6:
                    int min=num[0];
                    for (int x : num) {
                        if (x<min) {
                            min=x;
                        }
                    }
                    System.out.println("Lowest Number: "+min);
                break;
                
                // find the sum or product
                case 7:
                    System.out.print("Sum or product? ");
                    String opp=in.next().toLowerCase();
                    
                    switch (opp) {
                        case "sum":
                            int sum=0;
                            for (int x : num) {
                                sum+=x;
                            }
                            System.out.println("Sum: "+sum);
                        break;
                        
                        case "product":
                            int pro=1;
                            for (int x : num) {
                                pro*=x;
                            }
                            System.out.println("Product: "+pro);
                        break;
                        
                        default:
                            System.out.println("Invalid choice!!");
                    }
                break;
                
                // exit the program
                case 8:
                    System.out.println("Exiting program....");
                break;
                
                // repeat program if choice is invalid
                default:
                    System.out.println("Invalid choice!!");
            }           
        } while (choice!=8);
        
    }
}
