
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class abe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declaration of size of array1 and array2
        System.out.print("Enter the SIZE of ROW of array1 and array2: ");
        int rows=in.nextInt();
        System.out.print("Enter the SIZE of COLUMN of array1 and array2: ");
        int col=in.nextInt();
        
        // creating array1
        int[][] array1=new int[rows][col];
        
        // input elements in array1
        System.out.println("\nEnter elements of the array1:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.print("Enter element at position["+i+"]["+j+"]: ");
                array1[i][j]=in.nextInt();
            }
        }
        
        // creating array2
        int[][] array2=new int[rows][col];
        
        // input elements in array2
        System.out.println("\nEnter elements of the array2:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.print("Enter element at position["+i+"]["+j+"]: ");
                array2[i][j]=in.nextInt();
            }
        }
        
        // creating array3
        int[][] array3=new int[rows+rows][col];
        int a=0;
        
        // storing elements from array1 to array3
        for (int i=0; i<rows; i++, a++) {
            for (int j=0; j<col; j++) {
                array3[a][j]=array1[i][j];
            }
        }
        
        // storing elements from array2 to array3
        for (int i=0; i<rows; i++, a++) {
            for (int j=0; j<col; j++) {
                array3[a][j]=array2[i][j];
            }
        }
        
        // display contents of array1
        System.out.println("\nContents of array1:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.println("array1["+i+"]["+j+"]: "+array1[i][j]);
            }
        }
        
        // display contents of array2
        System.out.println("\nContents of array2:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                System.out.println("array2["+i+"]["+j+"]: "+array2[i][j]);
            }
        }
        
        // display contents of array3
        System.out.println("\nContents of array3:");
        for (int i=0; i<array3.length; i++) {
            for (int j=0; j<array3[i].length; j++) {
                System.out.println("array3["+i+"]["+j+"]: "+array3[i][j]);
            }
        }
        
    }
}
