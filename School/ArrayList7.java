
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer>grades=new ArrayList<>();
        
        grades.add(90);
        grades.add(89);
        grades.add(78);
        grades.add(92);
        grades.add(67);
        grades.add(66);
        
        for (int i=0; i<grades.size(); i++) {
            System.out.println("Grades: "+grades.get(i));
        }
        
        System.out.println("");
        
        grades.set(0, 80);
        
        for (int i=0; i<grades.size(); i++) {
            System.out.println("Grades: "+grades.get(i));
        }
        
        System.out.println("");
        
        grades.set(3, 100);
        grades.set(5, 99);
        for (int i=0; i<grades.size(); i++) {
            System.out.println("Grades: "+grades.get(i));
        }
    }
}
