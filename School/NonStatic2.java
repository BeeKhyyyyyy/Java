
package School;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class NonStatic2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        NonStatic2 ns=new NonStatic2();
        
        String name, course;
        int yrlevel;
        
        System.out.print("Enter your name: ");
        name=in.nextLine();
        System.out.print("Enter your course: ");
        course=in.nextLine();
        System.out.print("Enter year level: ");
        yrlevel=in.nextInt();
        
        ns.displayRecord(name, course, yrlevel);
    }
    
    public void displayRecord(String n, String c, int yr) {
        System.out.println("\nName: "+n);
        System.out.println("Course: "+c);
        System.out.println("Year Level: "+yr);
    }
}
