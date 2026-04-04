
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class abi {
    public static void printSum(int a, int b, int c) {
        int sum=a+b+c;
        
        System.out.println("Sum: "+sum);
        printSquare(sum);
    }
    
    public static void printSquare(int sq) {
        System.out.println("Square of "+sq+" is: "+sq*sq);
    }
    
    public static void printMax(int a, int b, int c) {
        int max=a;
        
        if (b>max) {
            max=b;
        } 
        
        if (c>max) {
            max=c;
        }
        
        System.out.println("Highest number: "+max);
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        int num1=in.nextInt();
        System.out.print("Enter num2: ");
        int num2=in.nextInt();
        System.out.print("Enter num3: ");
        int num3=in.nextInt();
        System.out.println("");
        
        printSum(num1, num2, num3);
        printMax(num1, num2, num3);
    }
}
