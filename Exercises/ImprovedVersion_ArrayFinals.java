/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 * 1st Term A.Y. 2024-2025 Fundamentals of Programming FINALS
 * @author Rafael, Khyron B. (a.k.a Wetpakner)
 * 11/18/2024
 */
public class ImprovedVersion_ArrayFinals {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Initialization
        final int SIZE=10;
        int num[]=new int[SIZE];
        int choice, count=0, sum=0, ave=0;
        
        // Program
        do {
            // Menu
            System.out.println("***************M E N U***************");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Average");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("*************************************");
            
            // Choice Input
            System.out.print("Enter your choice (1-5): ");
                choice=in.nextInt();
            System.out.println("");
            
            // Choices
            switch (choice) {
                // Add Elements (Numbers)
                case 1:
                    if (count < SIZE) {
                        for (int x=0; x<num.length; x++) {
                            System.out.print("Enter num["+x+"]: ");
                                int elem=in.nextInt();
                            num[x]=elem;
                            count++;
                        }
                        System.out.println("");
                    } else {
                        System.out.println("The elements are FULL!! Cannot enter more than 10 numbers.\n");
                    }
                break;
                
                // Display Elements
                case 2: 
                    for (int x=0; x<num.length; x++) {
                        System.out.println("Num["+x+"]: "+num[x]);
                    }
                    System.out.println("");
                break;
                
                // Average of the Elements
                case 3:
                    if (count==SIZE) {
                        for (int x=0; x<num.length; x++) {
                            sum+=num[x];
                            ave=sum/SIZE;
                        }
                        System.out.println("Average: "+ave+"\n");
                    } else {
                        System.out.println("Please input 10 numbers first.\n");
                    }
                break;
                
                // Search for Elements
                case 4:
                    System.out.print("Enter a number: ");
                        int search=in.nextInt();
                    boolean foundnum=false;
                    
                    for (int x=0; x<num.length; x++) {
                        if (search==num[x]) {
                            foundnum=true;
                        }
                    }
                    
                    if (foundnum) {
                        System.out.println("Number "+search+" is found!\n");
                    } else {
                        System.out.println("Number "+search+" is not found!\n");
                    }
                break;
                
                // Exiting the Program
                case 5:
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Value
                default:
                    System.out.println("Incorrect value!! Please enter 1-5 only!\n");
            }
        } while (choice!=5); 
    }
}
