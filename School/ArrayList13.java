
package School;

import java.util.*;

/**
 *
 * @author Wetpakner
 */
public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList <Integer> grades=new ArrayList<>();
        
        grades.add(90);
        grades.add(85);
        grades.add(96);
        grades.add(88);
        grades.add(56);
        grades.add(67);
        
        System.out.println("Before sorting: "+grades);
        
        Collections.sort(grades);
        System.out.println("Ascending order: "+grades);
        
        Collections.sort(grades, Collections.reverseOrder());
        System.out.println("Descending order: "+grades);
    }
}
