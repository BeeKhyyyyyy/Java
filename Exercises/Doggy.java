class Dog {  // Dog class
    // private Attributes (fields)
    private String name, breed, color;
    private int age;
    
    // Constructor (to initialize objects)
    Dog(String name, String breed, String color, int age) {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
    
    public void eat() {    // public method for eat()
        System.out.println("Eating...");
    }
    
    public void bark() {   // public method for bark()
        System.out.println("Barking...");
    }
    
    public void sleep() {  // public method for sleep()
        System.out.println("Sleeping...");
    }
    
    public void run() {    // public method for run()
        System.out.println("Running...");
    }
    
    public void getDetails() {    // public method to display dog info
        System.out.println("\n==Details of the Dog==");
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color: "+color);
        System.out.println("Age: "+age);
    }
}

public class Doggy {  // Main class
    public static void main(String[] args) {  // Main method
        // Creating an object of the Dog class
        Dog objDog=new Dog("Pulgoso", "Aspin", "Pink", 18);
        
        // Calling all methods on the object
        objDog.eat();
        objDog.bark();
        objDog.sleep();
        objDog.run();
        objDog.getDetails();
    }
}
