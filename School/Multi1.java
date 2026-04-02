
package School;

/**
 *
 * @author Wetpakner
 */
public class Multi1 {
    public static void main(String[] args) {
        int [][] grade = { {91,92,93,94}, {75,76,77,78}, {80,81,82,83} };
        
        for (int i=0; i<grade.length; i++) {
            for (int j=0; j<grade[i].length; j++) {
                System.out.print(grade[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
