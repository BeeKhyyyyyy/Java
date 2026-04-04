
import java.util.*;

class Subject {    // class for subjects
    private String code;    // private attributes of Subject
    private String name;
    private double fee;
    
    Subject(String code, String name, double fee) {    // constructor for Subject
        this.code=code;
        this.name=name;
        this.fee=fee;
    }
    
    public String code() {    // public method to get the subject code
        return code;
    }
    
    public String name() {    // public method to get the subject name
        return name;
    }
    
    public double fee() {    // public method to get the subject fee
        return fee;
    }
}

public class Enrollment {    // main class (Enrollment-driven interface)
    static Scanner in=new Scanner(System.in);    // initializing scanner
    
    // continuation part if the student submitted all the requirements
    public static void enroll(List<Subject> subs, String sname) {
        // displays the available subjects and user input to choose subjects
        System.out.println("\nAvailable Subjects: ");
        for (Subject sub : subs) {
            System.out.println((subs.indexOf(sub)+1) + ". " + sub.code() + " - " + sub.name());
        }
        System.out.print("Select subject numbers separated by commas (e.g., 1, 3): ");
        String input = in.nextLine();
        String[] nums = input.split(",");
        
        double totalFee=0;    // variable for the calculation of total fee
        
        // displays the selected subject and total fee and user input to confirm enrollment
        System.out.println("\nYou selected:");
        for (String num : nums) {
            int value = Integer.parseInt(num.trim());
            System.out.println("-" + subs.get(value-1).code());
            totalFee+=subs.get(value-1).fee();
        }
        System.out.println("\nTotal Fee: PHP " + totalFee);
        System.out.print("Do you want to confirm enrollment? (yes/no): ");
        String confirm=in.nextLine();
        
        // conditional logic to stimulate enrollment confirmation
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("\nEnrollment successful! Welcome to NU Laguna, " + sname + "!");
        } else if (confirm.equalsIgnoreCase("no")) {
            System.out.println("\nThank you for choosing us! We look forward to your next visit!");
        } else {
            System.out.println("\nInvalid choice! Please try again.");
        }
    }
    
    // main method for enrollment-driven interface
    public static void main(String[] args) {
        // array list for subjects
        List<Subject> subs = new ArrayList<>();
        subs.add(new Subject("CS101", "Introduction to Programming", 3000));
        subs.add(new Subject("MATH101", "College Algebra", 3000));
        subs.add(new Subject("ENG101", "Communication Skills", 3000));
        
        // user input for student's information
        System.out.println("Welcome to NU Laguna Enrollment System!");
        System.out.print("Enter student name: ");
        String sname=in.nextLine();
        System.out.print("Enter student ID: ");
        String id=in.nextLine();
        System.out.print("Enter year level (1-4): ");
        int year=in.nextInt();
        in.nextLine();
        System.out.print("Are all requirements submitted? (yes/no): ");
        String req=in.nextLine();
        
        // conditional logic to stimulate student's eligibility
        if (req.equalsIgnoreCase("yes")) {
            enroll(subs, sname);
        } else if (req.equalsIgnoreCase("no")) {
            System.out.println("\nPlease submit all the requirements first.");
        } else {
            System.out.println("\nInvalid choice! Please try again.");
        }
    }
}
