
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaelKhyronB
 */
public class rafaelINTERIM1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // size of the array
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size=in.nextInt();
            
            // reject if size is LESS than 0
            if (size<1) {
                System.out.println("Size must be greater than 0!\n");
            }
        } while (size<1);
        
        // creating the array with the specified size
        Integer [] num=new Integer[size];
        int choice, count=0;
        
        // main program
        do {
            System.out.println("\n***************M E N U***************");
            System.out.println("1. Add elements to the array");
            System.out.println("2. Display all elements");
            System.out.println("3. Search for an element");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");
            System.out.println("*************************************");
            
            // user input
            System.out.print("Enter your choice (1-5): ");
            choice=in.nextInt();
            System.out.println("");
            
            // choices
            switch (choice) {                
                // add elements to the array
                case 1:
                    if (count<size) {
                        for (int x=0; x<size; x++) {
                            System.out.print("Enter element at index "+x+": ");
                            num[x]=in.nextInt();
                            count++;
                        }
                    } else {
                        System.out.println("Array is FULL!");
                    }
                break;
                
                // display all elements of the array
                case 2:
                    for (int x=0; x<size; x++) {
                        System.out.println("Element at index "+x+": "+num[x]);
                    }
                break;
                
                // search for an element of the array
                case 3:
                    // execute if array is full
                    if (count==size) {
                        System.out.print("Search element: ");
                        int searchnum=in.nextInt();
                        boolean foundnum=false;
                    
                        for (int x=0; x<size; x++) {
                            if (searchnum==num[x]) {
                                foundnum=true;
                                System.out.println(searchnum+" is found at index "+x);
                            }
                        }
                        
                        if (!foundnum) {
                            System.out.println(searchnum+" is not found!");
                        } 
                    } 
                    
                    // reject if there are no elements in the array
                    else {
                        System.out.println("Enter "+size+" numbers first!");
                    }
                break;
                
                // sort the array (ascending or descending)
                case 4:
                    // execute if array is full
                    if (count==size) { 
                        System.out.print("Ascending or Descending? ");
                        String sort=in.next().toLowerCase();
                        
                        switch (sort) {
                            // ascending order
                            case "ascending":
                                Arrays.sort(num);
                                System.out.println("Ascending Order:");
                                
                                for (int x=0; x<size; x++) {
                                    System.out.println("Element at index "+x+": "+num[x]);
                                }
                            break;
                            
                            // descending order
                            case "descending":
                                Arrays.sort(num, Collections.reverseOrder());
                                System.out.println("Descending Order:");
                                
                                for (int x=0; x<size; x++) {
                                    System.out.println("Element at index "+x+": "+num[x]);
                                }
                            break;
                            
                            // reject if choice is invalid
                            default:
                                System.out.println("Invalid choice!!");
                        }
                    } 
                    
                    // reject if there are no elements in the array
                    else { 
                        System.out.println("Enter "+size+" numbers first!");
                    }
                break;
                
                // exit the program
                case 5:
                    System.out.println("Exiting program....");
                break;
                
                // execute if entered choice is invalid
                default:
                    System.out.println("Invalid choice!!");
            }           
        } while (choice!=5);
        
    }
}
