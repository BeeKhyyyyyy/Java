public class Student {
    public String name;
    public double grade;
    
    Student(String name, double grade) {
        this.name=name;
        this.grade=grade;
    }
    
    public static void main(String[] args) {
        Student student1=new Student("John", 95.00);
        
        student1.grade=1000.99;
        System.out.println(student1.name+"'s Grade: "+student1.grade);
    }
}
