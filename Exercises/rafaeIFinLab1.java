
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaelKhyronB
 */
public class rafaeIFinLab1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // initialization
        int choice;
        int balance=0;
        
        // account name and password, enter anything you want
        System.out.print("Enter account name: ");
        String name=in.nextLine();
        System.out.print("Enter password: ");
        String pass=in.nextLine(); 
        System.out.println("\nWelcome to Hampaslupa Bank of the Philippines!");
        System.out.println("How may I help you "+name+"?");
        
        // main program
        do {
            displayMenu();
            // user input
            System.out.print("Enter your choice (1-4): ");
            choice=in.nextInt();
            System.out.println("");
            
            // options
            switch (choice) {
                // deposit money
                case 1: 
                    System.out.print("How much money do you want to DEPOSIT? ");
                    int deposit=in.nextInt();
                    if (deposit>0) {
                        balance=depositMoney(balance, deposit);
                        System.out.println("New Balance: P"+balance);
                    } else {
                        System.out.println("The amount must be greater than 0.");
                    }
                break;
                
                // withdraw money
                case 2:
                    if (balance>0) {
                        System.out.print("How much money do you want to WITHDRAW? ");
                        int withdraw=in.nextInt();
                        if (withdraw>0 && withdraw<=balance) {
                            balance=withdrawMoney(balance, withdraw);
                            System.out.println("Current Account Balance: P"+balance);
                            System.out.println("Money Withdrew: P"+withdraw);
                        } else {
                            System.out.println("Insufficient funds!");
                        }
                    } else {
                        System.out.println("Insufficient funds! Deposit money first!");
                    }
                break;
                
                // check balance
                case 3:
                    checkBalance(balance);
                break;
                
                // exit the program
                case 4:
                    System.out.println("Thank you for choosing us! ");
                    System.out.println("We look forward to your next visit!");
                break;
                
                // invalid choice entered
                default:
                    System.out.println("Invalid choice!!");
            }
        } while (choice!=4);        
    }
    
    // static method to display menu
    public static void displayMenu() {        
        System.out.println("\n==================== MENU ====================");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("==============================================");
    }
    
    // static method to deposit money
    public static int depositMoney(int bal, int dep) {
        return bal+=dep;
    }
    
    // static method to withdraw money
    public static int withdrawMoney(int bal, int draw) {
        return bal-=draw;
    }
    
    // static method to check balance
    public static void checkBalance(int bal) {
        System.out.println("Current Account Balance: P"+bal);
    }
}
