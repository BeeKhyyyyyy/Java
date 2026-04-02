
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList <Float> grades=new ArrayList<>();
        
        grades.add(100.00f);
        grades.add(67f);
        grades.add(84.55f);
        
        System.out.println("Index 0: "+grades.get(0));
        System.out.println("Index 1: "+grades.get(1));
        System.out.println("Index 2: "+grades.get(2));
    }
}
