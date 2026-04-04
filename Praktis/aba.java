
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class aba {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declare size of the array
        System.out.print("Enter size of the row: ");
        int row=in.nextInt();
        System.out.print("Enter size of the column: ");
        int col=in.nextInt();
        
        // creating array
        int[][] num=new int[row][col];
        
        // input elements of the array
        System.out.println("\nEnter elements of the array");
        for (int x=0; x<row; x++) {
            for (int i=0; i<col; i++) {
                System.out.print("Enter element at position ["+x+"]["+i+"]: ");
                num[x][i]=in.nextInt();
            }
        }
        
        // display contents of the array
        int rows=1;
        System.out.println("\nContents of 2D array:");
        for (int i=0; i<row; i++) {
            System.out.println("\nRow: "+(i+1));
            for (int j=0; j<col; j++) {
                System.out.println("Num["+i+"]["+j+"]: "+num[i][j]);
            }
        }
        
        // calculating sum of rows
        System.out.println("\nSum of each rows:");
        for (int i=0; i<row; i++) {
            int rowSum=0;
            for (int j=0; j<col; j++) {
                rowSum+=num[i][j];
            }
            System.out.println("Row "+(i+1)+": "+rowSum);
        }
        
        // calculating sum of columns
        System.out.println("\nSum of each columns");
        for (int i=0; i<col; i++) {
            int colSum=0;
            for (int j=0; j<row; j++) {
                colSum+=num[j][i];
            }
            System.out.println("Col "+(i+1)+": "+colSum);
        }
        
        // finding the highest number
        int max=num[0][0];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (num[i][j]>max) {
                    max=num[i][j];
                }
            }
        }
        
        System.out.println("\nThe highest number in the array is: "+max);
        
        // finding the lowest number
        int min=num[0][0];
        for (int i=0; i<num.length; i++) {
            for (int j=0; j<num[i].length; j++) {
                if (num[i][j]<min) {
                    min=num[i][j];
                }
            }
        }
        
        System.out.println("The lowest number in the array is: "+min);
    }
}
