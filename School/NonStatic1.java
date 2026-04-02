
package School;

/**
 *
 * @author Wetpakner
 */
public class NonStatic1 {
    public static void main(String[] args) {
        NonStatic1 ns=new NonStatic1();
        ns.displayMsg();
    }
    
    public void displayMsg() {
        System.out.println("Wazzup mga ninja!");
    }
}
