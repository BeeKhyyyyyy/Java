
package HoneyBunch;

// Public class Account
public class Account {
    // Private attributes (fields) of Account
    private String name;
    private int age;
    private String username;
    private String password;
    
    // Constructor for Account (to initialize objects)
    Account(String name, int age, String username, String password) {
        this.name=name;
        this.age=age;
        this.username=username;
        this.password=password;
    }
    
    // Public method to display account info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
    }
    
    // Public method to change password
    public void changePassword(String password) {
        this.password=password;
    }
    
    // Public method to get name
    public String getName() {
        return name;
    }
    
    // Public method to get age
    public int getAge() {
        return age;
    }
    
    // Public method to get username
    public String getUsername() {
        return username;
    }
    
    // Public method to get password
    public String getPassword() {
        return password;
    }
    
    // Public method to set name
    public void setName(String name) {
        this.name=name;
    }
    
    // Public method to set age
    public void setAge(int age) {
        this.age=age;
    }
    
    // Public method to set username
    public void setUsername(String username) {
        this.username=username;
    }
}
