package OLDIES;

import java.util.Arrays;
import java.util.Scanner;

public class KupalSiVan2_0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declaration of variable and array
        String games[]=new String[5];
        String username="", password="";
        int choice, count=0, acc=0;
        
        // main program
        do {
            System.out.println("Welcome to PinayFlex!");
            System.out.println("1. Log in");
            System.out.println("2. Create account");
            System.out.println("3. Change username or password");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice (1-4): ");
            choice=in.nextInt();
            System.out.println("");
            
            // choices' flow
            switch (choice) {
                // log in
                case 1:
                    if (!username.equals("") && !password.equals("")) {
                        System.out.print("Enter username: ");
                        String user=in.next();
                        System.out.print("Enter password: ");
                        String pass=in.next();
                        
                        if (user.equals(username) && pass.equals(password)) {
                            System.out.println("Logged in successfully!\n");
                            if (count==games.length) {
                                int nums=1;
                                Arrays.sort(games);
                                System.out.println(user+"'s Top 5 Favorite Games");                                
                                for (String x : games) {
                                    System.out.println(nums+". "+x);
                                    nums++;
                                }
                                System.out.println("");
                            } else {
                                int nums=1;
                                System.out.println("Enter your top 5 favorite games.");
                                for (int x=0; x<games.length; x++) {
                                    System.out.print("Favorite Game no. "+nums+": ");
                                    games[x]=in.next();
                                    nums++;
                                    count++;
                                }
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Account not found! Check your username or password!\n");
                        }
                    } else {
                        System.out.println("Create account first!\n");
                    }
                break;
                
                // create account
                case 2:
                    if (acc==0) {
                        System.out.print("Enter username: ");
                        username=in.next();
                        System.out.print("Enter password: ");
                        password=in.next();                        
                        System.out.println("Account created successfully!\n");
                        acc++;
                    } else {
                        System.out.println("You can only create 1 account per email!\n");
                    }
                break;
                
                // change username or password
                case 3:
                    if (acc==1) {
                        System.out.print("Do you want to change your USERNAME, PASSWORD, or BOTH? ");
                        String option=in.next().toLowerCase();
                        
                        switch (option) {
                            case "username":
                                System.out.print("Enter your current username: ");
                                String user=in.next();
                                System.out.print("Enter your current password: ");
                                String pass=in.next();
                                
                                if (user.equals(username) && pass.equals(password)) {
                                    System.out.print("Enter new username: ");
                                    username=in.next();
                                    System.out.println("Username changed successfully!\n");
                                } else {
                                    System.out.println("Incorrect username or password!\n");
                                }
                            break;
                            
                            case "password":
                                System.out.print("Enter your current username: ");
                                String users=in.next();
                                System.out.print("Enter your current password: ");
                                String passs=in.next();
                                
                                if (users.equals(username) && passs.equals(password)) {
                                    System.out.print("Enter new password: ");
                                    password=in.next();
                                    System.out.println("Password changed successfully!\n");
                                } else {
                                    System.out.println("Incorrect username or password!\n");
                                }
                            break;
                            
                            case "both":
                                System.out.print("Enter your current username: ");
                                String use=in.next();
                                System.out.print("Enter your current password: ");
                                String pas=in.next();
                                
                                if (use.equals(username) && pas.equals(password)) {
                                    System.out.print("Enter new username: ");
                                    username=in.next();
                                    System.out.print("Enter new password: ");
                                    password=in.next();
                                    System.out.println("Username and password changed successfully!\n");
                                } else {
                                    System.out.println("Incorrect username or password!\n");
                                }
                            break;
                            
                            default:
                                System.out.println("Invalid choice!!\n");
                        }
                    } else {
                        System.out.println("Create account first!\n");
                    }
                break;
                
                // exit the program
                case 4:
                    System.out.println("Exiting program....");
                break;
                
                // execute if choice is invalid
                default:
                    System.out.println("Invalid choice!!\n");
            }
        } while (choice!=4);        
    }
}
