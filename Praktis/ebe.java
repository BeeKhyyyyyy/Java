
import java.util.*;

// Creating class named crush
class crush {
    
    // Attributes (fields)
    String myName, name;
    int myAge, age;
    
    // Contructor (to initialize objects)
    crush(String myName, int myAge, String name, int age) {
        this.myName=myName;
        this.myAge=myAge;
        this.name=name;
        this.age=age;
    }
    
    // Public method to display information
    void crushInfo() {
        System.out.println("\n===== INFORMATION =====");
        System.out.println("Name: "+myName);
        System.out.println("Age: "+myAge);
        System.out.println("===== CRUSH'S INFORMATION =====");
        System.out.println("Crush's name: "+name);
        System.out.println("Crush's age: "+age);
    }
    
    // Public method to display your compatibility with your crush
    void compatibility() {
        if (age>=18 && name.length()>=10) {
            System.out.println("-> Congratulations! You are 100% compatible with each other. <-");
        } else if (age>=18) {
            System.out.println("-> You are "+(int)(Math.random()*101)+"% compatible with each other. <-");
        } else {
            System.out.println("-> Minor yan kups!! Unless minor ka rin. <-");
        }
    }
}

// Main class to test the object of crush class
public class ebe {
    public static void main(String[] args) {  // Main method
        Scanner in=new Scanner(System.in);  // Scanner class  
        
        // Questions for your and your crush's info
        System.out.print("Enter your name: ");
        String myName=in.nextLine();
        System.out.print("Enter your age: ");
        int myAge=in.nextInt();
        in.nextLine();  // To consume nextLine
        System.out.print("Enter your crush's name: ");
        String name=in.nextLine();
        System.out.print("Enter your crush's age: ");
        int age=in.nextInt();
        
        // Instantiation (creating an object of the crush class)
        crush love=new crush(myName, myAge, name, age);
        
        // Calling all methods on the object named love of the crush class
        love.crushInfo();
        love.compatibility();
    }
}
