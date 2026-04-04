import java.util.*;

// Sublcass of Water named Iced
class Iced extends Water {
    // Overrides the describeState() method of Water class
    @Override
    public void describeState() {
        System.out.println("I'm flowing solid ice.");
    }
}

// Sublcass of Water named LiquidWater
class LiquidWater extends Water {
    // Overrides the describeState() method of Water class
    @Override
    public void describeState() {
        System.out.println("I'm flowing liquid water.");
    }
}

// Subclass of Water named Steam
class Steam extends Water {
    // Overrides the describeState() method of Water class
    @Override
    public void describeState() {
        System.out.println("I'm gaseous steam.");
    }
}

// Main class named Water
public class Water {
    // Public method to describe the state of the water
    public void describeState() {
        System.out.println("I'm just water.");
    }      
    
    // Public method to examine the state of the water
    public static void examineWater(Water[] samples) {
        // For-each loop to run through the array and call the describeState() method for each state
        for (Water s : samples) {
            s.describeState();
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // 'samples' array storing the instances of each state of water
        Water[] samples=new Water[4];
        
        // Adding instances of each state of water in the 'samples' array
        samples[0]=new Water();         // Water state
        samples[1]=new Iced();          // Iced state
        samples[2]=new LiquidWater();   // LiquidWater state
        samples[3]=new Steam();         // Steam state
        
        // Method to handle the new water states through polymorphism
        examineWater(samples);
    }
}
