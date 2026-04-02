
package School;

import java.util.ArrayList;

/**
 *
 * @author Wetpakner
 */
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList <Integer> grades=new ArrayList <> ();
        
        grades.add(90);
        grades.add(85);
        grades.add(88);
        grades.add(89);       
        System.out.println("Grades: "+grades);
        
        ArrayList <Integer> grade=new ArrayList<>();        
        grade.add(98);
        grade.add(100);        
        System.out.println("Grade: "+grade);
        
        grades.addAll(grade);
        System.out.println("Grades: "+grades);
    }
}
