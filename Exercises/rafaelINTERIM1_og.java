
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
public class rafaelINTERIM1_og {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Declare Variables
        String studId;
        String name;
        String course;
        String address;
        String citizen;
        String feeSched;
        String sy;
        String gender;
        String scholar;
        String subCode;
        String descrip;
        String section;
        String prereq;
        String subCod;
        int term;
        double totUnits;
        double lecUnits;
        double labUnits;
        
        // User Input
        System.out.print("Enter Student ID: ");
            studId = in.nextLine();
        System.out.print("Enter your Name: ");
            name = in.nextLine();
        System.out.print("Enter your Course: ");
            course = in.nextLine();
        System.out.print("Enter your Address: ");
            address = in.nextLine();
        System.out.print("Enter your Citizenship: ");
            citizen = in.nextLine();
        System.out.print("Enter Fee Schedule: ");
            feeSched = in.nextLine();
        System.out.print("Enter School Year: ");
            sy = in.nextLine();
        System.out.print("Enter your Gender: ");
            gender = in.nextLine();
        System.out.print("Enter Scholarship: ");
            scholar = in.nextLine();
        System.out.print("Enter Subject Code: ");
            subCode = in.nextLine();
        System.out.print("Enter Description: ");
            descrip = in.nextLine();
        System.out.print("Enter Section: ");
            section = in.nextLine();
        System.out.print("Enter Pre-requisite: ");
            prereq = in.nextLine();
        System.out.print("Enter Subject Code: ");
            subCod = in.nextLine();
        System.out.print("Enter Term: ");
            term = in.nextInt();
        System.out.print("Enter Total Units: ");
            totUnits = in.nextDouble();
        System.out.print("Enter Lecture Units: ");
            lecUnits = in.nextDouble();
        System.out.print("Enter Lab Units: ");
            labUnits = in.nextDouble();
        System.out.println("\n");
        
        // COF
        System.out.println("\t\t\tC E R T I F I C A T E O F R E G I S T R A T I O N");
        System.out.print("Student ID:\t" + studId);
        System.out.println("\t\t\t\tSchool Year:\t" + sy);
        System.out.print("Name:\t\t" + name);
        System.out.println("\t\t\tTerm:\t\t" + term);
        System.out.print("Citizenship:\t" + citizen);
        System.out.println("\t\t\t\tGender:\t\t" + gender);
        System.out.print("Address:\t" + address);
        System.out.println("\t\t\tScholarship:\t" + scholar);
        System.out.println("Course:\t\t" + course);
        System.out.println("Fee Schedule:\t" + feeSched);
        System.out.println("\n\nSubject Code:\tDescription\t\t\t\tSection\t\t\tTotal Units");
        System.out.println(subCode + "\t\t" + descrip + "\t" + section + "\t\t" + totUnits);
        System.out.println("\t\t\t\t\t\t\tLec Units:\t" + lecUnits + "\tLab Units:\t" + labUnits);
        System.out.println("Pre-requisite:\t" + prereq + "\t\t\tSubject Code:\t" + subCod);
        
    }
}
