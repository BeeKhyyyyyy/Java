
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class abo {
    public static int printSum(int a, int b, int c) {
        return a+b+c;
    }
    
    public static int printSquare(int sq) {
        return sq*sq;
    }
    
    public static int printMax(int a, int b, int c) {
        int max=a;
        
        if (b>max) {
            max=b;
        }
        
        if (c>max) {
            max=c;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        int num1=in.nextInt();
        System.out.print("Enter num2: ");
        int num2=in.nextInt();
        System.out.print("Enter num3: ");
        int num3=in.nextInt();
        
        int sum=printSum(num1, num2, num3);
        
        System.out.println("\nSum: "+sum);
        System.out.println("Square of "+sum+": "+printSquare(sum));
        System.out.println("Highest: "+printMax(num1, num2, num3));
    }
}
