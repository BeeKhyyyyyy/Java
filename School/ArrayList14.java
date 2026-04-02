
package School;

import java.util.*;

/**
 *
 * @author Wetpakner
 */
public class ArrayList14 {
    public static void main(String[] args) {
        ArrayList <String> students=new ArrayList<>();
        
        students.add("Zamora");
        students.add("Honra");
        students.add("Manguiat");
        students.add("Salazar");
        students.add("Atienza");
        students.add("Limsic");
        
        System.out.println("Original value of Arraylist: "+students);
        
        students.sort(Comparator.naturalOrder());
        System.out.println("Ascending order: "+students);
        
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("Descending order: "+students);
    }
}
