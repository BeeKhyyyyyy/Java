
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        
        names.add("Vincent");
        names.add("Edison");
        names.add("Princess");
        names.add("Rose Ann");
        
        System.out.println("Elements before removal:");
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));            
        }
        
        names.clear();
        System.out.println("\nArrayList cleared....");
        
        System.out.println("\nElements after removal: "+names);
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
