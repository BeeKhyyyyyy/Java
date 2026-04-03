


import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Enter a Number
        System.out.print("Enter a positive number greater than 0: ");
        int num=in.nextInt();
        
        // Answer (Summation of 1 to Inputted POSITIVE Number GREATER than 0)
        if (num>0) {
            int sum=0;
            for (int x=0; x<=num; x++) {
                sum+=x;
            }
            System.out.println("Sum of 1 to "+num+": "+sum);
        } else { // If Inputted Number is 0 or LESS than 0
            System.out.println("Please enter number greater than 0");
        }
        
    }
}
