
import java.util.Scanner;

/**
 *
 * @author RafaelKhyronB
 */
public class LectureExercise {
    public static void main(String[] args) {        
        // scanner and object for non-static
        Scanner in=new Scanner(System.in);
        LectureExercise ns=new LectureExercise();
        
        // initialization for the sides of triangle
        double a, b, c;
        
        do {
            // user input for the sides of triangle
            System.out.println("Please input three numbers for a, b, c:");
            a=in.nextDouble();            
            // if entered a is less than 1 the program will end, else continue
            if (a>0) {
                b=in.nextDouble();
                c=in.nextDouble();
        
                // condition whether to display area and perimeter or not
                if (a+b>c) {
                    double area=ns.area(a, b, c);
                    double perimeter=ns.perimeter(a, b, c);
                
                    System.out.printf("The area is %.3f",area);
                    System.out.printf("\nThe perimeter is %.3f\n\n",perimeter);
                } else {
                    System.out.println("The input is invalid!\n");
                }
            } else {
                System.out.println("Bye~");
            }
        } while (a>0);
    }
    
    // non-static method to calculate area
    public double area(double a, double b, double c) {
        double s=(a+b+c)/2; // where s is semiperimeter
        
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    // non-static method to calculate perimeter
    public double perimeter(double a, double b, double c) {
        return a+b+c;
    }
}
