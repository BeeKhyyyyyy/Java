
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Initialization
        int num[]=new int[10];
        int count=0, sum=0, ave=0, max=0, min;
        char choice;
        
        // Program
        do {
            // Menu
            System.out.println("***************M E N U***************");
            System.out.println("A. Add");
            System.out.println("B. Display");
            System.out.println("C. Average");
            System.out.println("D. Maximum Value");
            System.out.println("E. Minimum Value");
            System.out.println("F. Search");
            System.out.println("G. Exit");
            System.out.println("*************************************");
            
            // Choice Input
            System.out.print("Enter your choice: ");
            choice=in.next().toUpperCase().charAt(0);
            System.out.println("");
            
            // Choices
            switch (choice) {
                // Add Numbers
                case 'A':
                    if (count<num.length) {
                        for (int x=0; x<num.length; x++) {
                            System.out.print("Enter num["+x+"]: ");
                            num[x]=in.nextInt();
                            count++;
                        }
                        System.out.println("");
                    }
                    else {
                        System.out.println("Cannot enter more than 10 numbers!\n");
                    }
                break;
                
                // Display Numbers
                case 'B':
                    for (int x=0; x<num.length; x++) {
                        System.out.println("Num["+x+"]: "+num[x]);
                    }
                    System.out.println("");
                break;
                
                // Average
                case 'C':
                    if (count==10) {
                        for (int x=0; x<num.length; x++) {
                            sum+=num[x];
                            ave=sum/10;
                        }
                        System.out.println("Average: "+ave+"\n");
                    }
                    else {
                        System.out.println("Enter 10 numbers first!\n");
                    }
                break;
                
                // Maximum Value
                case 'D':
                    for (int x=0; x<num.length; x++) {
                        if (num[x]>max) {
                            max=num[x];
                        }
                    }
                    System.out.println("Maximum Number: "+max+"\n");
                break;
                
                // Minimum Value
                case 'E':
                    min=num[0];
                    for (int x=0; x<num.length; x++) {
                        if (num[x]<min) {
                            min=num[x];
                        } 
                    }
                    System.out.println("Minimum Number: "+min+"\n");
                break;
                
                // Search
                case 'F':
                    System.out.print("Search number: ");
                    int searchnum=in.nextInt();
                    boolean foundnum=false;
                    
                    for (int x=0; x<num.length; x++) {
                        if (searchnum==num[x]) {
                            foundnum=true;
                            break;
                        }
                    }
                    
                    if (foundnum) {
                        System.out.println("Number "+searchnum+" is found!\n");
                    }
                    else {
                        System.out.println("Number "+searchnum+" is not found!\n");
                    }
                break;
                
                // Exit
                case 'G':
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Input
                default:
                    System.out.println("Invalid Choice!!\n");
            }
        } while (choice!='G');
        
    }
}
