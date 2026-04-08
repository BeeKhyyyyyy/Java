/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        char choice;
        
        do { 
        System.out.println("**********M E N U**********");
        System.out.println("A. Operators \nB. Even or Odd \nC. Exit");
        System.out.println("***************************");
        
        System.out.print("\nEnter your choice (A-C): ");
        choice=in.next().toUpperCase().charAt(0);
        
        switch (choice) {
            case 'A':
                System.out.print("\nEnter num1: ");
                int num1=in.nextInt();
                System.out.print("Enter num2: ");
                int num2=in.nextInt();
        
                System.out.println("\n************M E N U************");
                System.out.println("1. Add \n2. Sub \n3. Div \n4. Pro");
                System.out.println("*******************************");
        
                System.out.print("\nEnter your choice (1-4): ");
                int cho=in.nextInt();
        
                switch (cho) {
                    case 1:
                        int sum=num1+num2;
                        System.out.println(num1+" + "+num2+"= "+sum);
                        break;
                    case 2:
                        int sub;
                        if (num1>num2) {
                            sub=num1-num2;
                            System.out.println(num1+" - "+num2+"= "+sub);
                        } else {
                            sub=num2-num1;
                            System.out.println(num2+" - "+num1+"= "+sub);
                        }
                        break;
                    case 3:
                        int div=num1/num2;
                        System.out.println(num1+"/"+num2+"= "+div);
                        break;
                    case 4:
                        int pro=num1*num2;
                        System.out.println(num1+"*"+num2+"= "+pro);
                        break;
                    default:
                        System.out.println("Invalid choice!!");
                }
                break;
                
            case 'B':
                System.out.print("\nEnter num: ");
                int num=in.nextInt();
                
                if (num>0 && num%2==0)
                    System.out.println(num+" is a Positive and Even Number");
                else if (num>0 && num%2!=0)
                    System.out.println(num+" is a Positive and Odd Number");
                else if (num<0 && num%2==0)
                    System.out.println(num+" is a Negarive and Even Number");
                else if (num<0 && num%2!=0)
                    System.out.println(num+" is a Negative and Odd Number");
                else 
                    System.out.println(num+" is a Zero");
                break;
                
            case 'C':
                System.out.println("Exiting Program....");
                break;
                
            default:
                System.out.println("Invalid choice!!");
        }
        } while (choice!='C');
            
    }
}
