
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        
        names.add("Vincent");
        names.add("Edison");
        names.add("Princess");
        names.add("Rose Ann");
        
        System.out.println(names);
        
        String check="Edison";
        if (names.contains(check)) {
            System.out.println("The ArrayList contains "+check);
        } else {
            System.out.println("The ArrayList does not contain "+check);
        }
    }
}
