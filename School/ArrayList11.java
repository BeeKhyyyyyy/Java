
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        
        names.add("Vincent");
        names.add("Edison");
        names.add("Princess");
        names.add("Rose Ann");
        names.add("Edison");
        
        System.out.println(names);
        
        String find="Edison";
        
        int indexelement=names.indexOf(find);
        
        if (indexelement!=-1) {
            System.out.println("Index of "+find+": "+indexelement);
        } else {
            System.out.println(find+" is not found in the ArrayList!");
        }
    }
}
