package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class KingInaMo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Welcome Stage
        System.out.println("Welcome to INumU!");
        System.out.println("A site where we love our numbers.");
        
        // Input Size
        System.out.print("\nHow many numbers do you want to enter? ");
        int size=in.nextInt();
        
        // Initialization
        int num[]=new int[size];
        int choice;
        int count=0, ave=0, i=1;
        
        // Program
        do {
            System.out.println("\n***************M E N U***************");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Average");
            System.out.println("4. Search");
            System.out.println("5. Even or Odd");
            System.out.println("6. Maximum or Minimum");
            System.out.println("7. Sum");
            System.out.println("8. Product");
            System.out.println("9. Exit");
            System.out.println("*************************************");
            
            // Input Choice
            System.out.print("Enter your choice (1-9): ");
            choice=in.nextInt();
            System.out.println("");
            
            // Choices
            switch (choice) {
                
                // Add Numbers
                case 1:
                    if (count<size) {
                        System.out.print("Enter num["+i+"]: ");
                        num[count]=in.nextInt();
                        i++;
                        count++;
                    } else {
                        System.out.println("Cannot input more than "+size+" numbers!");
                    }
                break;
                
                // Display Numbers
                case 2:
                    int y=1;
                    for (int x=0; x<num.length; x++) {
                        System.out.println("Num["+y+"]: "+num[x]);
                        y++;
                    }
                break;
                
                // Average of the Numbers
                case 3:
                    if (count==size) {
                        int sumAve=0;
                        for (int x : num) {
                            sumAve+=x;
                            ave=sumAve/num.length;
                        }
                        System.out.println("Average: "+ave);
                    } else {
                        System.out.println("Please input "+size+" numbers first!");
                    }
                break;
                
                // Search for a Number
                case 4:
                    System.out.print("Search number: ");
                    int searchnum=in.nextInt();
                    int cout=0;
                    boolean foundnum=false;
                    
                    for (int x=0; x<num.length; x++) {
                        if (searchnum==num[x]) {
                            foundnum=true;
                        }
                        if (searchnum!=num[x]) {
                            continue;
                        }
                        cout++;
                    }
                    
                    if (foundnum) {
                        System.out.println("There is "+cout+" in the list! "+searchnum+" is found!");
                    } else {
                        System.out.println("There is "+cout+" in the list! "+searchnum+" is not found!");
                    }
                break;
                
                // Identify Whether Even or Odd Number(s)
                case 5:
                    if (count==0) {
                        System.out.println("Input atleast 1 number first!");
                    } else {
                        System.out.print("What do you want to know? (Even or Odd): ");
                        String will=in.next();
                        
                        String evenList="", oddList="";
                        int even=0, odd=0;
                        for (int x : num) {
                            if (x%2==0) {
                                evenList+=x+" ";
                                even+=x;
                            } else {
                                oddList+=x+" ";
                                odd+=x;
                            }
                        }
                        
                        if (will.equalsIgnoreCase("Even")) {
                            System.out.println("Even Numbers: "+evenList);
                            System.out.println("Sum of Even Numbers: "+even);
                        } else if (will.equalsIgnoreCase("Odd")) {
                            System.out.println("Odd Numbers: "+oddList);
                            System.out.println("Sum of Odd Numbers: "+odd);
                        } else {
                            System.out.println("Invalid Choice!!");
                        }
                    }
                break;
                
                // Identify the Maximum or Minimum Number
                case 6:
                    System.out.println("A. Maximum Number");
                    System.out.println("B. Minimum Number");
                    System.out.print("\nEnter your choice (A or B): ");
                    char option=in.next().toUpperCase().charAt(0);
                    
                    int max=0, min=num[0];
                    for (int x : num) {
                        if (x>max) {
                            max=x;
                        }
                        if (x<min) {
                            min=x;
                        }
                    }
                    
                    switch (option) {
                        case 'A':
                            System.out.println("Maximum Number: "+max);
                        break;
                        
                        case 'B':
                            System.out.println("Minimum Number: "+min);
                        break;
                        
                        default:
                            System.out.println("Invalid Choice!!");
                    }
                break;
                
                // Sum of all Numbers
                case 7: 
                    int sum=0;
                    for (int x : num) {
                        sum+=x;
                    }
                    System.out.println("Sum: "+sum);
                break;
                
                // Product of all Numbers
                case 8:
                    if (count==0) {
                        System.out.println("Product: "+0);
                    } else {
                        int pro=1;
                        for (int x : num) {
                            pro*=x;
                        }
                        System.out.println("Product: "+pro);
                    }
                break;
                
                // Exit
                case 9:
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Choice
                default:
                    System.out.println("Please enter the correct option!");
            }  
        } while (choice!=9);
        
    }
}
