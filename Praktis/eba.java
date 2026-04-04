
import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class eba {    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declaration of size and choice
        int choice;
        int rows, col;
        
        System.out.print("Enter the SIZE of the ROW of the array: ");
        rows=in.nextInt();
        System.out.print("Enter the SIZE of the COLUMN of the array: ");
        col=in.nextInt();
        
        // creation of the array
        Integer[][] num=new Integer[rows][col];
        int count=0;
        
        // main menu
        do {
            displayMenu();
            System.out.print("Enter your choice (1-6): ");
            choice=in.nextInt();
            System.out.println("");
            
            switch (choice) {
                // input elements to the array
                case 1: 
                    if (count==0) {
                        num=addNum(in, rows, col);
                        count++;
                    } else {
                        System.out.println("Array is FULL!!");
                    }
                break;
                
                // display contents of the array
                case 2: 
                    displayNum(num);
                break;
                    
                // search number in the array
                case 3: 
                    if (count!=0) {
                        searchNum(in, num);
                    } else {
                        System.out.println("There are no elements in the array!");
                    }
                break;
                
                // calculate the rows of the array
                case 4: 
                    if (count!=0) {
                        calculateRowsSum(num);
                    } else {
                        System.out.println("Input elements in the array first!");
                    }
                break;
                
                // calculate the columns of the array
                case 5: 
                    if (count!=0) {
                        calculateColSum(num);
                    } else {
                        System.out.println("Input elements in the array first!");
                    }
                break;
                    
                // leave the program
                case 6: 
                    System.out.println("Exiting program....");
                break;
                    
                // invalid choice entered
                default: 
                    System.out.println("Invalid choice!!");
            }           
        } while (choice!=6);        
    }
    
    // static method to display menu
    public static void displayMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Add elements");
        System.out.println("2. Display contents");
        System.out.println("3. Search element");
        System.out.println("4. Calculate rows");
        System.out.println("5. Calculate columns");
        System.out.println("6. Exit");
        System.out.println("==========================");
    }
    
    // static method to add elements to the array
    public static Integer[][] addNum(Scanner in, int a, int b) {
        Integer[][] num=new Integer[a][b];
        
        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.print("Enter element at position["+i+"]["+j+"]: ");
                num[i][j]=in.nextInt();
            }
        }

        return num;
    }
    
    // static method to display contents of the array
    public static void displayNum(Integer[][] a) {
        System.out.println("Contents of the 2D array:");
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.println("num["+i+"]["+j+"]: "+a[i][j]);
            }
        }
    }
    
    // static method to search elements
    public static void searchNum(Scanner in, Integer[][] a) {
        System.out.print("Enter a number you want to search: ");
        int search=in.nextInt();
        boolean found=false;
        
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if (search==a[i][j]) {
                    found=true;
                    System.out.println(search+" is found at index["+i+"]["+j+"].");
                }
            }
        }
        
        if (!found) {
            System.out.println(search+" is not found in the array!");
        }
    }
    
    // static method to calculate rows sum
    public static void calculateRowsSum(Integer[][] a) {
        for (int i=0; i<a.length; i++) {
            int rowSum=0;
            for (int j=0; j<a[i].length; j++) {
                rowSum+=a[i][j];
            }
            System.out.println("Row "+(i+1)+": "+rowSum);
        }
    }
    
    // static method to calculate columns sum
    public static void calculateColSum(Integer[][] a) {
        for (int i=0; i<a[0].length; i++) {
            int colSum=0;
            for (int j=0; j<a.length; j++) {
                colSum+=a[j][i];
            }
            System.out.println("Column "+(i+1)+": "+colSum);
        }
    }
}
