
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList <Integer> grades=new ArrayList <> (); 
        
        grades.add(90);
        grades.add(85);
        grades.add(88);
        grades.add(89);
        
        System.out.println("Grades: "+grades);
        
        grades.add(0,60);
        grades.add(3,68);
                
        System.out.println("Grades: "+grades);
    }
}
