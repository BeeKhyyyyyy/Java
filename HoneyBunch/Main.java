
package HoneyBunch;

import java.util.*;

// Menu-driven interface (Main class)
public class Main {
    
    // Initializing scanner and creating array list of users
    static Scanner in=new Scanner(System.in);
    private static List<User> users = new ArrayList();
    
    // Log in | Sign up interface
    public static void main(String[] args) {
        int choice;   // Variable choice made by the user
        
        // Do-while loop for log in | sign up page
        System.out.println("Welcome to HoneyBunch!");
        do {
            System.out.println("1. Log in");   // Choices
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");   // User input
            while (!in.hasNextInt()) {   // Handles error when a String is entered
                System.out.print("Invalid choice! Please enter a number: ");
                in.next();
            }
            choice=in.nextInt();
            in.nextLine();   // Consumes next line
            System.out.println();
            
            // Choices
            switch (choice) {
                case 1:   // Log in existing account
                    LogIn();
                    break;
                    
                case 2:   // Sign up to create new account
                    SignUp();
                    break;
                    
                case 3:   // Exit the program
                    System.out.println("Bye bye, HoneyBunch!!...");
                    break;
                    
                default:  // Executes if the entered choice is invalid
                    System.out.println("Invalid choice!! Please try again!");
            }
            System.out.println("---------------------------------------------");
        } while (choice != 3);   // Executes while the choice is not 3
    }
    
    // Log in interface
    public static void LogIn() { 
        System.out.print("Enter your username: ");   // User input for username
        String username=in.nextLine();
        System.out.print("Enter your password: ");   // User input for password
        String pass=in.nextLine();
        
        boolean status=false;   // Boolean variable that will determine if the account is found or not
        int userNum=0;          // Int variable that will determine the index of the user, if found
            
        if (users.isEmpty()) {   // If there are no accounts yet, it will throw this and return
            System.out.println("Account not found!");
            return;
        } else {   // If the username and password match, the account and index will be found      
            for (User user : users) {
                if (username.equals(user.getUsername()) && pass.equals(user.getPassword())) {
                    status=true;
                    userNum=users.indexOf(user);
                    break;   // Breaks the loop
                }
            }
        }
        
        if (status) {   // If the account is found, proceed to the main program
            System.out.println("Logged in successfully!");
            Menu(userNum);
        } else {   // Else, it will throw this and return to the log in or sign up page
            System.out.println("Account not found!");
        }
    }
    
    // Sign up interface
    public static void SignUp() {
        System.out.print("Enter your name: ");   // User input to set name
        String name=in.nextLine();
        System.out.print("Enter your age: ");   // User input to set age
        while (!in.hasNextInt()) {   // Handles error when a String is entered
            System.out.print("Please enter a number: ");
            in.next();
        }
        int age=in.nextInt();
        while (age < 1) {   // Prompts the user to input valid age if the input is less than 1
            System.out.print("Enter a number greater than 0: ");
            while (!in.hasNextInt()) {   // Handles error when a String is entered
                System.out.print("Please enter a number: ");
                in.next();
            }
            age=in.nextInt();
        }
        in.nextLine();   // Consumes next line
        System.out.print("Enter your username: ");   // User input to set username
        String username=in.nextLine();
        System.out.print("Enter your password: ");   // User input to set password
        String password=in.nextLine();
        
        for (User user : users) {   // If the entered username already exists, reject account
            if (username.equals(user.getUsername())) {
                System.out.println("Account already exists!");
                return;
            }
        }
        
        // Will create the account if the username (account) does not yet exists
        User user=new User(name, age, username, password);
        users.add(user);
        System.out.println("Account created successfully!");
    }
    
    // Main Menu/Program
    public static void Menu(int userNum) {
        System.out.println("\n==> Welcome to HoneyBunch, " + users.get(userNum).getUsername() + " <==");
        
        int choice;   // Choice made by the user
        do {   // Do-while loop for the HoneyBunch program
            System.out.println("1. Search crush");   // Choices
            System.out.println("2. Add crush");
            System.out.println("3. Remove crush");
            System.out.println("4. Change crush");
            System.out.println("5. Display crush");
            System.out.println("6. Settings");
            System.out.println("7. Log out");
            System.out.print("Enter your choice (1-6): ");   // User input
            while (!in.hasNextInt()) {   // Handles error when a String is entered
                System.out.print("Invalid choice! Please enter a number: ");
                in.next();
            }
            choice=in.nextInt();
            System.out.println();
            
            // Choices
            switch (choice) {
                case 1:   // Option 1 to search for your crush
                    users.get(userNum).searchCrush();
                    break;
                    
                case 2:   // Option 2 to add your crush
                    users.get(userNum).addCrush();
                    break;
                    
                case 3:   // Option 3 to remove your crush
                    users.get(userNum).removeCrush();
                    break;
                    
                case 4:   // Option 4 to change/modify your crush
                    users.get(userNum).changeCrush();
                    break;
                    
                case 5:   // Option 5 to display your crush list
                    users.get(userNum).displayCrush();
                    break;
                    
                case 6:   // Option 6 to access settings
                    Settings(userNum);
                    break;
                    
                case 7:   // Option 7 to log out
                    System.out.println("Logging out....");
                    break;
                    
                default:  // Executes if the entered choice is invalid
                    System.out.println("Invalid choice!! Please try again!");
            }
            System.out.println("=============================================");
        } while (choice != 7);   // Executes while the choice is not 7
    }
    
    // Account Settings
    public static void Settings(int userNum) {
        System.out.println("***************** SETTINGS ******************");
        System.out.println("1. Display account info");   // Options
        System.out.println("2. Change password");
        System.out.println("3. Display name, age, or username");
        System.out.println("4. Change name, age, or username");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");   // User input
        while (!in.hasNextInt()) {   // Handles error when a String is entered
            System.out.print("Invalid choice! Please enter a number: ");
            in.next();
        }
        int choice=in.nextInt();
        in.nextLine();   // Consumes next line
        System.out.println();
        
        // Options
        switch (choice) {
            case 1:   // Option 1 to display your info
                users.get(userNum).displayInfo();
                break;
                
            case 2:   // Option 2 to change your password
                System.out.print("Enter your current password: ");   // User input for password
                String pass=in.nextLine();
                
                if (pass.equals(users.get(userNum).getPassword())) {   // If password match, proceed
                    System.out.print("Enter new password: ");   // User input to create new password
                    String newPass=in.nextLine();                    
                    // Reject new password if it is the same as the old one
                    if (newPass.equalsIgnoreCase(users.get(userNum).getPassword())) {
                        System.out.print("Failed to change password! ");
                        System.out.println("Entered password is the same as the existing one.");
                        return;
                    }                    
                    // Create new password if it does not match the old one
                    users.get(userNum).changePassword(newPass);
                    System.out.println("Password changed successfully!");
                } else {   // Else if the password is incorrect, reject the user to create new password
                    System.out.println("Incorrect password!");
                }
                break;
                
            case 3:   // Option 3 to get either name, age, or username
                getInfo(userNum);
                break;
                
            case 4:   // Option 4 to change either name, age, or username
                setInfo(userNum);
                break;
                
            case 5:   // Option 5 to exit settings
                break;
                
            default:  // Executes if the entered choice is invalid
                System.out.println("Invalid choice!!");
        }
        System.out.println("*********************************************");
    }
    
    // Option 3 to get info (name, age, or username)
    public static void getInfo(int userNum) {
        System.out.println("A. Name");   // Choices
        System.out.println("B. Age");
        System.out.println("C. Username");
        System.out.println("D. Exit");
        System.out.print("What do you want to get (A-D): ");   // User input
        char choice=in.next().toUpperCase().charAt(0);
        System.out.println();
        
        // Choices
        switch (choice) {
            case 'A':   // Choice A to get name
                System.out.println("Name: " + users.get(userNum).getName());
                break;
                
            case 'B':   // Choice B to get age
                System.out.println("Age: " + users.get(userNum).getAge());
                break;
                
            case 'C':   // Choice C to get username
                System.out.println("Username: " + users.get(userNum).getUsername());
                break;
                
            case 'D':   // Choice D to exit option 3
                break;
                
            default:    // Executes if the entered choice is invalid
                System.out.println("Invalid choice!!");
        }
    }
    
    // Option 4 to change your name, age, or username
    public static void setInfo(int userNum) {
        System.out.println("A. Name");   // Choices
        System.out.println("B. Age");
        System.out.println("C. Username");
        System.out.println("D. Exit");
        System.out.print("What do you want to change (A-D): ");   // User input
        char choice=in.next().toUpperCase().charAt(0);
        in.nextLine();   // Consumes next line
        System.out.println();
        
        // Choices
        switch (choice) {
            case 'A':   // Choice A to change name
                System.out.print("Enter new name: ");   // User input to set new name
                String newName=in.nextLine();
                // Rejects new name if it is the same as the old one
                if (newName.equalsIgnoreCase(users.get(userNum).getName())) {
                    System.out.print("Failed to change name! ");
                    System.out.println("Entered name is the same as the existing one.");
                    return;
                }
                // Create new name if it is not the same as the old one
                users.get(userNum).setName(newName);
                System.out.println("Name modified successfully!");
                break;
                
            case 'B':   // Choice B to change age
                System.out.print("Enter new age: ");   // User input to set new age
                while (!in.hasNextInt()) {   // Handles error when a String is entered
                    System.out.print("Please enter a number: ");
                    in.next();
                }
                int newAge=in.nextInt();
                while (newAge < 1) {   // Prompts the user to enter valid age greater than 0 if invalid
                    System.out.print("Enter a value greater than 0: ");
                    while (!in.hasNextInt()) {   // Handles error when a String is entered
                        System.out.print("Please enter a number: ");
                        in.next();
                    }
                    newAge=in.nextInt();
                }
                // Rejects new age if it is the same as the old one
                if (newAge == users.get(userNum).getAge()) {
                    System.out.print("Failed to change age! ");
                    System.out.println("Entered age is the same as the existing one.");
                    return;
                }
                // Create new age if it is not the same as the old one
                users.get(userNum).setAge(newAge);
                System.out.println("Age modified successfully!");
                break;
                
            case 'C':   // Choice C to change username
                System.out.print("Enter new username: ");   // User input to set new username
                String newUsername=in.nextLine();
                // Rejects new username if it is the same as the old one
                if (newUsername.equalsIgnoreCase(users.get(userNum).getUsername())) {
                    System.out.print("Failed to change username! ");
                    System.out.println("Entered username is the same as the existing one.");
                    return;
                }
                // For-each loop to check if the username already exists, reject if it does
                for (User user : users) {
                    if (newUsername.equalsIgnoreCase(user.getUsername())) {
                        System.out.println("Failed to change username as it already exists!");
                        return;
                    }
                }
                // Create new username if it is not yet existing
                users.get(userNum).setUsername(newUsername);
                System.out.println("Username modified successfully!");
                break;
                
            case 'D':   // Choice D to exit option 4
                break;
                
            default:    // Executes if the entered choice is invalid
                System.out.println("Invalid choice!!");
        }
    }
}
