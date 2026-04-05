
package walalang;

/**
 *
 * @author Wetpakner
 */
public class ex {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++) {
            sum=calculateSum(sum, i);
        }
        System.out.println("Sum from 1 to 10 is: "+sum);        
        
        int sum2=0;
        for (int i=20; i<=30; i++) {
            sum2=calculateSum(sum2, i);
        }
        System.out.println("Sum from 20 to 30 is: "+sum2);        
        
        int sum3=0;
        for (int i=35; i<=45; i++) {
            sum3=calculateSum(sum3, i);
        }
        System.out.println("Sum from 35 to 45 is: "+sum3);
    }
    
    public static int calculateSum(int sum, int i) {
        return sum+=i;
    }
}
