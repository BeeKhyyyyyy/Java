
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        
        names.add("Vincent");
        names.add("Edison");
        names.add("Princess");
        names.add("Rose Ann");
        names.add("Edison");
        
        System.out.println(names);
        
        String find="Edison";
        int lastindex=names.lastIndexOf(find);
        if (lastindex!=-1) {
            System.out.println("Last index of "+find+": "+lastindex);
        } else {
            System.out.println(find+" is not found on the ArrayList");
        }
    }
}
