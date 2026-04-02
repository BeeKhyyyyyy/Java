
package School;

/**
 *
 * @author Wetpakner
 */
public class Nested3 {
    public static void main(String[] args) {
        int j=1;
        
        while (j<=10) {
            System.out.println("<"+j+">");
            
            int i=1;
            while (i<=10) {
                System.out.println(j+"x"+i+" = "+j*i);
                i++;
            }
            
            System.out.println("");
            j++;
        }
    }
}
