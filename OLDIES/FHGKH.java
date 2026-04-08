
package OLDIES;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FHGKH {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // creating size of the array
        int size;       
        do {
            System.out.print("Enter size of the array: ");
            size=in.nextInt();
            
            if (size<1) {
                System.out.println("Enter size greater than 0\n");
            }
        } while (size<1);
        
        // declaration of variables & creating array
        String [] names=new String[size];
        String choice;
        int count=0;
        
        // main program
        do {
            System.out.println("\n----------M E N U----------");
            System.out.println("-Add");
            System.out.println("-Display");
            System.out.println("-Search");
            System.out.println("-Sort");
            System.out.println("-Descending");
            System.out.println("-Replace");
            System.out.println("-Exit");
            System.out.println("---------------------------");
            // userinput
            System.out.print("Enter your choice: ");
            choice=in.next().toLowerCase();
            System.out.println("");
            
            // choices flow
            switch (choice) {
                // add students to the class
                case "add":
                    if (count<size) {
                        for (int x=0; x<size; x++) {
                            System.out.print("Enter student at index "+x+": ");
                            names[x]=in.next();
                            count++;
                        }
                    } else {
                        System.out.println("Class is FULL!");
                    }
                break;
                
                // display the students in the class
                case "display":
                    for (int x=0; x<size; x++) {
                        System.out.println("Student at index "+x+": "+names[x]);
                    }
                break;
                
                // search for a student
                case "search":
                    System.out.print("Search student: ");
                    String search=in.next();
                    boolean found=false;
                    int num=0;
                    
                    for (int x=0; x<size; x++) {
                        if (search.equalsIgnoreCase(names[x])) {
                            found=true;
                            ++num;
                            System.out.print("There is "+num+" in the list! ");
                            System.out.println(search+" is found at index "+x);
                        }
                    }
                    
                    if (!found) {
                        System.out.println("There is "+num+" in the list!");
                    }
                break;
                
                // sort the students in alphabetical order
                case "sort":
                    if (count==size) {
                        Arrays.sort(names);
                        int counting=1;
                        System.out.println("Alphabetical Order:");
                        for (String x : names) {
                            System.out.println("Student "+counting+": "+x);
                            counting++;
                        }
                    } else {
                        System.out.println("Enter "+size+" students first!");
                    }
                break;
                
                // sort the students in descending order
                case "descending":
                    if (count==size) {
                        Arrays.sort(names, Collections.reverseOrder());
                        int counting=1;
                        System.out.println("Descending Order:");
                        for (String x : names) {
                            System.out.println("Student "+counting+": "+x);
                            counting++;
                        }
                    } else {
                        System.out.println("Enter "+size+" students first!");
                    }
                break;
                
                // replace a student
                case "replace":
                    if (count==size) {
                        System.out.print("Enter the student you want to replace: ");
                        String stud=in.next();
                        boolean foundstud=false;
                        
                        for (int x=0; x<size; x++) {
                            if (stud.equalsIgnoreCase(names[x])) {
                                foundstud=true;
                                System.out.print("Enter the new student: ");
                                names[x]=in.next();
                                System.out.println("Student successfully replaced!");
                            }
                        }
                        
                        if (!foundstud) {
                            System.out.println("Student not found!");
                        }
                    } else {
                        System.out.println("Enter "+size+" students first!");
                    }
                break;
                
                // leave the program
                case "exit":
                    System.out.println("Exiting program....");
                break;
                
                // execute if invalid choice
                default:
                    System.out.println("Invalid choice!!");
            }           
        } while (!choice.equals("exit"));
        
    }
}
