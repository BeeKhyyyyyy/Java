
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList8 {
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
        
        int remove1=3;
        if (remove1>=0 && remove1<names.size()) {
            names.remove(remove1);
            System.out.println("\nElement at index "+remove1+" removed...");
        } else {
            System.out.println("\nInvalid index!! No elements removed!");
        }
        
        System.out.println("\nElements after removal:");
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
