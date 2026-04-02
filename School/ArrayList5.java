
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        
        names.add("Vincent");
        names.add("Edison");
        names.add("Princess");
        names.add("Rose Ann");
        
        int size=names.size();
        System.out.println("Number of elements in the ArrayList: "+size);
        
        for (int i=0; i<names.size(); i++) {
            System.out.println("Names: "+names.get(i));
        }
        System.out.println(names);
    }
}
