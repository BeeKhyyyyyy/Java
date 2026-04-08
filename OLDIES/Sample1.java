package OLDIES;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Filename: Sample1.java
 * @author Wetpakner
 */
public class Sample1 {
    public static void main(String[] san) {
        Scanner in = new Scanner(System.in);
        
        // Data
        double a;
        double b;
        
        // Data Print
        System.out.println("Pythagorean Theorem");
        System.out.println("c^2 = a^2 + b^2");
        System.out.println("");
        System.out.print("Enter any value for a: ");
        a = in.nextDouble();
        System.out.print("Enter any value for b: ");
        b = in.nextDouble();
        System.out.println("");
        System.out.println("");
        
        // Solution
        double A = a * a;
        double B = b * b;
        double sum = A + B;
        double C = Math.sqrt(sum);
        
        // Answer
        System.out.println("Solution:");
        System.out.println("");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = ?");
        System.out.println("");
        System.out.println("c^2 = a^2 + b^2");
        System.out.println("c^2 = " + a + "^2" + " + " + b + "^2");
        System.out.println("c^2 = " + A + " + " + B);
        System.out.println("c^2 = " + sum);
        System.out.println("√c^2 = " + "√" + sum);
        System.out.println("");
        System.out.println("c = " + C);
        System.out.println("Pythagorean Theorem lang sakalam!!");
        
    }
}
