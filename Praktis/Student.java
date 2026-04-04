// Creating class called Student
public class Student {
    // Attributes (field)
    String name;
    int age;
    static String schoolName;
    
    // Constructor (to initialize objects)
    Student(String name, int age) {
        this.name=name;
        this.age=age;   // using "this" keyword to assign values to the fields
    }
    
    // Method to show details of the student
    void showInfo() {
        System.out.println("Student Name: "+name);
        System.out.println("Student Age : "+age);
        System.out.println("School Name : "+schoolName);
    }
    
    // Main method
    public static void main(String[] args) {
        // Setting schoolName to NU Laguna
        Student.schoolName="NU Laguna";
        
        // Creating 2 objects of the Student class 
        Student student1=new Student("John", 18);
        Student student2=new Student("Jane", 19);
        
        // Calling the showInfo() method on the objects
        student1.showInfo();
        System.out.println("");
        student2.showInfo();
    }
}
