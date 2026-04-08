package OLDIES;


import java.util.Arrays;
import java.util.Scanner;

public class CalcuNgInaMO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declaration of variables, array, and initialization
        char choice;
        
        // main program
        System.out.print("Welcome to CalcuNgInaMO!");
        
        do {
            System.out.println("\n**********O P T I O N**********");
            System.out.println("a. Addition");
            System.out.println("b. Subtraction");
            System.out.println("c. Multiplication");
            System.out.println("d. Division");
            System.out.println("e. Summation");
            System.out.println("f. Exit");
            System.out.println("*******************************");
            
            // user input
            System.out.print("Enter your choice (a-f): ");
            choice=in.next().toLowerCase().charAt(0);
            System.out.println("");
            
            switch (choice) {
                // addition
                case 'a':
                    int addSize, sum=0;
                    do {
                        System.out.print("How many numbers would you like to add? ");
                        addSize=in.nextInt();
                        
                        if (addSize<1) {
                            System.out.println("Number must be greater than 0.\n");
                        }
                    } while (addSize<1);
                    
                    int add[]=new int[addSize];
                    for (int x=0; x<addSize; x++) {
                        System.out.print("Enter num"+x+": ");
                        add[x]=in.nextInt();
                        sum+=add[x];
                    }
                    
                    System.out.println("Sum: "+sum);
                break;
                
                // subtraction
                case 'b':
                    int subSize;
                    do {
                        System.out.println("Note: We recommend you to subract 2 numbers only.");
                        System.out.print("How many numbers would you like to subtract? ");
                        subSize=in.nextInt();
                        
                        if (subSize<1) {
                            System.out.println("Number must be greater than 0.\n");
                        }
                    } while (subSize<1);
                    
                    int sub[]=new int[subSize];
                    Arrays.sort(sub);
                    for (int x=0; x<subSize; x++) {
                        System.out.print("Enter num"+x+": ");
                        sub[x]=in.nextInt();
                    }
                                        
                    int diff=sub[0];
                    for (int x=1; x<subSize; x++) {
                        diff-=sub[x];
                    }
                    
                    System.out.println("Difference: "+diff);
                break;
                
                // multiplication
                case 'c':
                    int proSize;
                    do {
                        System.out.print("How many numbers would you like to multiply? ");
                        proSize=in.nextInt();
                    
                        if (proSize<1) {
                            System.out.println("Number must be greater than 0.\n");
                        }
                    } while (proSize<1);
                    
                    int pro[]=new int[proSize];
                    for (int x=0; x<proSize; x++) {
                        System.out.print("Enter num"+x+": ");
                        pro[x]=in.nextInt();
                    }
                    
                    int mult=pro[0];
                    for (int x=1; x<proSize; x++) {
                        mult*=pro[x];
                    }
                    
                    System.out.println("Product: "+mult);
                break;
                
                // division
                case 'd':
                    System.out.print("Enter num1: ");
                    int num1=in.nextInt();
                    System.out.print("Enter num2: ");
                    int num2=in.nextInt();
                    
                    int quo=0;
                    if (num1>num2) {
                        quo=num1/num2;
                    } else {
                        quo=num2/num1;
                    }
                    
                    System.out.println("Quotient: "+quo);
                break;
                
                // summation
                case 'e':
                    int size, sigma=0;
                    do {
                        System.out.print("Enter a number: ");
                        size=in.nextInt();
                        
                        if (size<1) {
                            System.out.println("Number must be greater than 0.\n");
                        }
                    } while (size<1);
                    
                    int summation[]=new int[size];
                    for (int x=0; x<size; x++) {
                        summation[x]=x+1;
                    }
                    
                    for (int x : summation) {
                        sigma+=x;
                    }
                    
                    System.out.println("Summation of "+size+" from 1-"+size+": "+sigma);
                break;
                
                // exit
                case 'f':
                    System.out.println("Exiting program....");
                break;
                
                // invalid choice
                default:
                    System.out.println("Invalid choice!!");
            }            
        } while (choice!='f');               
    }
}
