
package School;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class Multi2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows=in.nextInt();
        System.out.print("Enter the number of columns: ");
        int col=in.nextInt();
        
        int [][] twod=new int[rows][col];
        
        System.out.println("\nEnter the elements");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.print("Enter element at position ["+i+"]["+j+"]: ");
                twod[i][j]=in.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("Contents of 2D Array");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.println("Array ["+i+"]["+j+"]: "+twod[i][j]);
            }
        }
        
        int highnum=twod[0][0];
        for (int x=0; x<rows; x++) {
            for (int i=0; i<col; i++) {
                if (twod[x][i]>highnum) {
                    highnum=twod[x][i];
                }
            }
        }
        System.out.println("\nHighest number in array: "+highnum);
    }
}
