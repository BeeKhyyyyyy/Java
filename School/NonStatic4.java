
package School;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class NonStatic4 {
    public static void main(String[] args) {
        NonStatic4 ns=new NonStatic4();
        
        double[] scores=ns.getScore();
        double grade=ns.calculateGrade(scores);
        ns.displayRemark(grade);
    }
    
    public double[] getScore() {
        Scanner in=new Scanner(System.in);
        
        double[] scores=new double[3];
        
        System.out.print("Enter quiz score: ");
        scores[0]=in.nextDouble();
        System.out.print("Enter class standing score: ");
        scores[1]=in.nextDouble();
        System.out.print("Enter exam score: ");
        scores[2]=in.nextDouble();
        
        return scores;
    }
    
    public double calculateGrade(double[] s) {
        return (s[0]*0.3)+(s[1]*0.3)+(s[2]*0.4);
    }
    
    public void displayRemark(double gr) {
        String remark= gr>=90? "Excellent" : gr>=75? "Good" : "Failed";
        System.out.println("\nFinal Grade: "+gr);
        System.out.println("Remark: "+remark);
    }
}
