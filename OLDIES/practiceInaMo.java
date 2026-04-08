
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class practiceInaMo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Declaring of Size
        int size;
        
        // Welcome Poooo
        System.out.println("Welcome to 69ine!");
        System.out.println("Love your numbers as you love 69.\n");
        
        // Enter Size of Array
        do {
            System.out.print("Enter the SIZE of your Array: ");
            size=in.nextInt();
        
            if (size<1) {
                System.out.println("Enter a POSITIVE number GREATER than 0!\n");
            }
        } while (size<1);
        
        // Initialization
        int num[]=new int[size];
        char choice;
        int count=0;
        
        // Program
        do {
            // Ano po Order nyo???
            System.out.println("---------------M E N U---------------");
            System.out.println("A. Add Numbers");
            System.out.println("B. Display Numbers");
            System.out.println("C. Search Number");
            System.out.println("D. Average");
            System.out.println("E. Maximum or Minimum");
            System.out.println("F. Positive, Negative, or Zero");
            System.out.println("G. Even or Odd");
            System.out.println("H. Sum or Product");
            System.out.println("I. Exit");
            System.out.println("-------------------------------------");
            
            // InputChoice
            System.out.print("Enter your choice: ");
            choice=in.next().toUpperCase().charAt(0);
            System.out.println("");
            
            // Choices
            switch (choice) {
                
                // Add and Store Numbers in the Array
                case 'A':
                    if (count<size) {
                        for (int x=0; x<num.length; x++) {
                            System.out.print("Enter num["+x+"]: ");
                            num[x]=in.nextInt();
                            count++;
                        }
                    } else {
                        System.out.println("Array is FULL!");
                    }
                break;
                
                // Display Inputted Numbers
                case 'B':
                    int y=0;
                    for (int x : num) {
                        System.out.println("Num["+y+"]: "+x);
                        y++;
                    }
                break;
                
                // Search Number
                case 'C':
                    System.out.print("Search Number: ");
                    int searchnum=in.nextInt();
                    boolean foundnum=false;
                    int found=0;
                    
                    for (int x : num) {
                        if (searchnum==x) {
                            foundnum=true;
                        }
                        if (searchnum!=x) {
                            continue;
                        }
                        found++;
                    }
                    
                    if (foundnum) {
                        System.out.println("There is "+found+" in the list! "+searchnum+" is found!");
                    } else {
                        System.out.println("There is "+found+" in the list! "+searchnum+" is not found!");
                    }
                break;
                
                // Get the Average
                case 'D':
                    if (count==size) {
                        int sumAve=0, ave=0;
                        for (int x : num) {
                            sumAve+=x;
                            ave=sumAve/size;
                        }
                        System.out.println("Average: "+ave);
                    } else {
                        System.out.println("Input "+size+" numbers first!");
                    }
                break;
                
                // Determine the MAXIMUM or MINIMUM Number
                case 'E':
                    System.out.print("Maximum or Minimum? ");
                    String option=in.next().toLowerCase();
                    
                    int max=num[0], min=num[0];
                    switch (option) {
                        case "maximum":
                            for (int x : num) {
                                if (x>max) {
                                    max=x;
                                }
                            }
                            System.out.println("Maximum Number: "+max);
                        break;
                        
                        case "minimum":
                            for (int x : num) {
                                if (x<min) {
                                    min=x;
                                }
                            }
                            System.out.println("Minimum Number: "+min);
                        break;
                        
                        default:
                            System.out.println("Invalid Choice!!");
                    }
                break;
                
                // List of POSITIVE, NEGATIVE, or ZERO Numbers
                case 'F':
                    if (count==0) {
                        System.out.println("Input atleast 1 number first!");
                    } else {
                        System.out.print("Positive, Negative, or Zero? ");
                        String opt=in.next();
                    
                        String positiveList="", negativeList="", zeroList="";
                        int sumPos=0, sumNeg=0;
                        for (int x : num) {
                            if (x>0) {
                                positiveList+=x+" ";
                                sumPos+=x;
                            } else if (x<0) {
                                negativeList+=x+" ";
                                sumNeg+=x;
                            } else {
                                zeroList+=x+" ";
                            }
                        }
                    
                        switch (opt.toLowerCase()) {
                            case "positive":
                                System.out.println("Positive Numbers: "+positiveList);
                                System.out.println("Sum: "+sumPos);
                            break;
                        
                            case "negative":
                                System.out.println("Negative Numbers: "+negativeList);
                                System.out.println("Sum: "+sumNeg);
                            break;
                        
                            case "zero":
                                System.out.println("Zeroes: "+zeroList);
                                System.out.println("Sum: "+0);
                            break;
                        
                            default:
                                System.out.println("Invalid Choice!!");
                        }
                    }
                break;
                
                // Determine the EVEN or ODD Numbers
                case 'G':
                    if (count==0) {
                        System.out.println("Input atleast 1 number first!");
                    } else {
                        System.out.println("1. Even\n2. Odd");
                        System.out.print("\nEnter your Choice (1 or 2): ");
                        int will=in.nextInt();
                    
                        String evenList="", oddList="";
                        int evens=0, odds=0;
                        for (int x : num) {
                            if (x%2==0) {
                                evenList+=x+" ";
                                evens+=x;
                            } else {
                                oddList+=x+" ";
                                odds+=x;
                            }
                        }
                    
                        if (will==1) {
                            System.out.println("Even Numbers: "+evenList);
                            System.out.println("Sum: "+evens);
                        } else if (will==2) {
                            System.out.println("Odd Numbers: "+oddList);
                            System.out.println("Sum: "+odds);
                        } else {
                            System.out.println("Invalid Choice!!");
                        }
                    }
                break;
                
                // Determine the SUM or PRODUCT of the Numbers
                case 'H':
                    System.out.print("Sum or Product: ");
                    String pili=in.next();
                    
                    if (pili.equalsIgnoreCase("sum")) {
                        int sum=0;
                        for (int x=0; x<num.length; x++) {
                            sum+=num[x];
                        }
                        System.out.println("Sum of ALL Numbers: "+sum);
                    } else if (pili.equalsIgnoreCase("product")) {
                        if (count==0) {
                            System.out.println("Product of ALL Numbers: "+0);
                        } else {
                            int pro=1;
                            for (int x : num) {
                                pro*=x;
                            }
                            System.out.println("Product of ALL Numbers: "+pro);
                        }
                    } else {
                        System.out.println("Invalid Choice!!");
                    }
                break;
                
                // Leave the Program
                case 'I':
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Input
                default:
                    System.out.println("Invalid Choice!!");
            }
        } while (choice!='I');
        
    }
}
