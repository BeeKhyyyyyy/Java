
package HoneyBunch;

import java.util.*;

// Public class User extending Account
public class User extends Account {
    // Initializing scanner and private array list of User 
    private Scanner in=new Scanner(System.in);
    private List<String> crushes;
    
    // Constructor for User, which also initializes the array list
    User(String name, int age, String username, String password) {
        super(name, age, username, password);
        crushes=new ArrayList<>();
    }
    
    // Public method to search for your crush
    public void searchCrush() {
        System.out.print("Search your crush: ");   // User input for crush
        String crush=in.nextLine();
        boolean found=false;   // Boolean variable to determine if the crush is found
        
        for (String c : crushes) {   // For-each loop to iterate crush list
            if (crush.equalsIgnoreCase(c)) {   // If the crush is found, this will execute
                System.out.println(crush + " is found in the crush list!");
                found=true;
                break;
            }
        }
        
        if (!found) {   // Else if the crush is not found, this will execute
            System.out.println(crush + " is not found!");
        }
    }
    
    // Public method to add crush
    public void addCrush() {
        System.out.print("Enter the name of your crush you want to add: ");   // User input to add crush
        String crush=in.nextLine();
        crushes.add(crush);
        System.out.println("Crush " + crush + " added successfully!");
    }
    
    // Public method to remove crush
    public void removeCrush() {
        System.out.print("Enter the name of your former crush you want to remove: ");   // User input to remove crush
        String exCrush=in.nextLine();
        boolean found=false;   // Boolean variable to determine if the crush is found
        
        for (String c : crushes) {   // If the crush is found, remove crush
            if (exCrush.equalsIgnoreCase(c)) {
                crushes.remove(c);
                System.out.println("Ex-Crush " + exCrush + " removed successfully!");
                found=true;
                break;
            }
        }
        
        if (!found) {   // Else if the crush is not found, this will execute
            System.out.println(exCrush + " does not exist in the list!");
        }
    }
    
    // Public method to change crush
    public void changeCrush() {
        System.out.print("Enter the name of your crush you want to change: ");   // User input to modify crush
        String crush=in.nextLine();
        boolean found=false;   // Boolean variable to determine if the crush is found
        
        for (String c : crushes) {   // If the crush exists, allow the user to change his/her crush
            if (crush.equalsIgnoreCase(c)) {
                System.out.print("Enter new crush: ");
                String newCrush=in.nextLine();
                crushes.set(crushes.indexOf(c), newCrush);
                System.out.println("Crush modified successfully!");
                found=true;
                break;
            }
        }
        
        if (!found) {   // Else if the crush is not found, this will execute
            System.out.println(crush + " does not exist in the list!");
        }
    }
    
    // Public method to display your crush list
    public void displayCrush() {
        if (crushes.isEmpty()) {   // Displays this if the user does not have any crush yet
            System.out.println("You do not have any crush yet.");
        } else {   // Else, display crush list
            System.out.println("Crush List:");
            for (int i=0; i<crushes.size(); i++) {
                System.out.println(i+1 + ". " + crushes.get(i));
            }
        }
    }
}
