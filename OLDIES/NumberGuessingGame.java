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
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Welcome
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Just guess the number to win. \nGood Luck!!");
        
        // Initialization
        int randomNum=(int)(Math.random()*101);
        int num, x=0;
        
        // Loop
        do {
            // Enter Num
            System.out.print("\nEnter a Number between 0-100: ");
            num=in.nextInt();
                
            // Condition
            if (num==randomNum) {
                System.out.println("CORRECT!");
            } else if (num<0 || num>100) {
                System.out.println("Incorrect Value!! Please enter a number between 0-100 only.");
            } else if (num<randomNum) {
                System.out.println("HIGHER!");
            } else {
                System.out.println("LOWER!");
            }
                
            // Attempts
            x++;
        } while (num!=randomNum);
        
        // Congratulatory
        System.out.println("\nCONGRATULATIONS!!");
        System.out.println("Total Number of Attempts: "+x);
    }
}
