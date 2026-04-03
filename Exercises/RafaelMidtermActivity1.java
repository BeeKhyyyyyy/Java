
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Filename: RafaelMidtermActivity1.java
 * Date Created: August 20, 2024
 * Description: Using Scanner Class
 * @author Khyron Rafael
 */
public class RafaelMidtermActivity1 {
    public static void main(String[] khy) {
        Scanner input = new Scanner(System.in);
        
        // Declare Variables
        String lname;
        String fname;
        String mid;
        String bday;
        String bplace;
        String email;
        String dpart;
        String prog;
        String year;
        
        // Heading
        String head = "************STUDENT INFORMATION SHEET**************";
        String sub = "***************************************************";
        System.out.println(head);
        System.out.println("");
        System.out.println(sub);
        
        // User Input
        System.out.print("Enter your First Name: ");
            fname = input.nextLine();
        System.out.print("Enter your Middle Name: ");
            mid = input.nextLine();
        System.out.print("Enter your Last Name: ");
            lname = input.nextLine();
        System.out.print("Enter your Birthday: ");
            bday = input.nextLine();
        System.out.print("Enter your Birthplace: ");
            bplace = input.nextLine();
        System.out.print("Enter your email address: ");
            email = input.nextLine();
        System.out.print("Enter your Department: ");
            dpart = input.nextLine();
        System.out.print("Enter your Program: ");
            prog = input.nextLine();
        System.out.print("Enter your Year: ");
            year = input.nextLine();
        
        // Message
        System.out.println("");
        System.out.println("");
        System.out.println("You entered the following information:");
        System.out.println("");
        
        // Display Output
        System.out.println("Lastname: " + lname);
        System.out.println("Firstname: " + fname);
        System.out.println("Middlename: " + mid);
        System.out.println("Birthday: " + bday);
        System.out.println("Birthplace: " + bplace);
        System.out.println("Email: " + email);
        System.out.println("Department: " + dpart);
        System.out.println("Program: " + prog);
        System.out.println("Year Level: " + year);
    }
}
