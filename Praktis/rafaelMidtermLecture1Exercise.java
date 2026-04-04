
import java.util.*;

// Class named Students that contains the IDNo, SName, Degree, GWA
class Students {
    // Attributes of Students class
    String id;
    String sname;
    String degree;
    double gwa;
    
    // Constructor for Students
    Students(String id, String sname, String degree, double gwa) {
        this.id=id;
        this.sname=sname;
        this.degree=degree;
        this.gwa=gwa;
    }
}

public class rafaelMidtermLecture1Exercise {    // Main class
    public static void main(String[] args) {    // Main method
        // ArrayList for the objects of Students
        List<Students> students = new ArrayList<>();
        students.add(new Students("2024-101010", "Dimagiba", "BSCS", 3.65));
        students.add(new Students("2024-111111", "Agapits", "BSCS", 3.50));
        students.add(new Students("2024-100001", "De Luna", "BSCS", 3.80));
        students.add(new Students("2024-1025460", "Mejia", "BSCS", 4.00));
        
        // List of students sorted alphabetically with their corresponding GWAs
        List<String> sortedSname = new ArrayList<>();
        for (Students studs : students) {            
            sortedSname.add(studs.sname);
        }
        sortedSname.sort(Comparator.naturalOrder());
        
        System.out.println("Students sorted alphabetically with their corresponding GWAs:");
        for (String name : sortedSname) {
            for (Students studs : students) {
                if (name.equals(studs.sname)) {
                    System.out.println("Student Name: " + name + ", GWA: " + studs.gwa);
                }
            }
        }
        
        // List of students and their GWAs sorted in descending order
        List<Double> descendingGwa = new ArrayList<>(); 
        for (Students studs : students) {
            descendingGwa.add(studs.gwa);
        }
        Collections.sort(descendingGwa, Collections.reverseOrder());
        
        System.out.println("\nStudents' GWAs sorted in descending order:");
        for (double gwa : descendingGwa) {
            for (Students studs : students) {
                if (gwa == studs.gwa) {
                    System.out.println("Student Name: " + studs.sname + ", GWA: " + gwa);
                }
            }
        }
    }
}
