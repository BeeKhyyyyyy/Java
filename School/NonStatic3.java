
package School;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class NonStatic3 {
    public static void main(String[] args) {
        NonStatic3 student=new NonStatic3();
        
        double quiz=student.getQuiz();
        double cs=student.getClassStand();
        double exam=student.getExam();
        double grade=student.calculateGrade(quiz, cs, exam);
        
        student.displayRemark(grade);
    }
    
    public double getQuiz() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter quiz score: ");
        return in.nextDouble();
    }
    
    public double getClassStand() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter class standing: ");
        return in.nextDouble();
    }
    
    public double getExam() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter exam score: ");
        return in.nextDouble();
    }
    
    public double calculateGrade(double q, double cs, double e) {
        return (q*0.3)+(cs*0.3)+(e*0.4);
    }
    
    public void displayRemark(double g) {
        String remark;
        
        if (g>=90) {
            remark="Excellent";
        } else if (g>=75) {
            remark="Good";
        } else {
            remark="Failed";
        }
        
        System.out.println("\nFinal Grade: "+g);
        System.out.println("Remark: "+remark);
    }
}
