
package walalang;

import java.util.*;

public class Fibonacci {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter the nth term you want to find in the Fibonacci Sequence");
        System.out.println("if 1st term : enter 0  || 2nd term : 1 || 3rd term : 2 || 4th term : 3 || ....");
        System.out.print("= ");
        while (!in.hasNextInt()) {
            System.out.print("Please enter a number.\n= ");
            in.next();
        }
        int nth = in.nextInt();
        
        System.out.println("\n==> " + F(nth));
    }
    
    public static int F(int nth) {
        if (nth <= 1) {
            return nth;
        } else {
            return F(nth - 1) + F(nth - 2);
        }
    }
}
