
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Welcome Crush Baka Naman
        System.out.println("Welcome to CrusheeCakes!");
        System.out.println("Hide or show your crush to the world!!");
        
        // Declaration
        int crush;
        
        // Number of your Crush
        do {
            System.out.print("\nHow many crush do you have? ");
            crush=in.nextInt();
            
            if (crush==0) {
                System.out.println("Sowsss... Imposibleng wala kang crush bat kapa pumunta dito. PAAYOS PO!");
            } else if (crush<0) {
                System.out.println("PAAYOS PO! Imposible pong magkaron ka ng "+crush+" na crush.");
            } else {
                System.out.println("AYIEEEEE!!! SANAOLLLL!!!!");
            }
        } while (crush<=0);
        
        // Initialization
        String crushies[]=new String[crush];
        String choice, lock="";
        int count=0;
        
        // Program
        do {
            // Options
            System.out.println("\n----------O P T I O N----------");
            System.out.println(">Add");
            System.out.println(">Lock");
            System.out.println(">Display");
            System.out.println(">Search");
            System.out.println(">MATCH");
            System.out.println(">Help");
            System.out.println(">Exit");
            System.out.println("-------------------------------");
            
            // Enter Choice
            System.out.print("Enter your choice: ");
            choice=in.next().toLowerCase();
            System.out.println("");
            
            // Choices
            switch (choice) {
                
                // ADD your CRUSH(ES)! RUPOK mo tlga!!
                case "add":
                if (count<crush) {
                    int y=1;
                    for (int x=0; x<crushies.length; x++) {
                        System.out.print("Enter crush["+y+"]: ");
                        crushies[x]=in.next();
                        count++;
                        y++;
                    }
                } else {
                    System.out.println("Crush list is FULL!! Bawas karupukan behh!");
                }
                break;
                
                // LOCK mo para di nila makita mga CRUSH mo
                case "lock":
                    if (count<crush) {
                        System.out.println("Input your Crush(es) first!!");
                    } else {
                        System.out.print("Enter new password: ");
                        lock=in.next();
                    }
                break;
                
                // DISPLAY your CRUSH(ES)
                case "display":
                    if (lock.equals("")) {
                        int y=1;
                        for (String x : crushies) {
                            System.out.println("Crush["+y+"]: "+x);
                            y++;
                        }
                    } else {
                        System.out.print("Enter password: ");
                        String pass=in.next();
                        
                        int y=1;
                        if (pass.equals(lock)) {
                            for (String x: crushies) {
                                System.out.println("Crush ["+y+"]: "+x);
                                y++;
                            }
                        } else {
                            System.out.println("Incorrect Password!!");
                        }
                    }
                break;
                
                // SEARCH for your CRUSH
                case "search":
                    if (lock.equals("")) {
                        System.out.print("Search: ");
                        String searchname=in.next();
                        boolean foundname=false;
                        int cout=0;
                        
                        for (String x : crushies) {
                            if (searchname.equalsIgnoreCase(x)) {
                                foundname=true;
                            }
                            if (!searchname.equalsIgnoreCase(x)) {
                                continue;
                            }
                            cout++;
                        }
                        
                        if (foundname) {
                            System.out.println("There is "+cout+" in the list! "+searchname+" is found!");
                        } else {
                            System.out.println("There is "+cout+" in the list! "+searchname+" is not found!");
                        }
                    } else {
                        System.out.print("Enter password: ");
                        String pass=in.next();
                        
                        if (pass.equals(lock)) {
                            System.out.print("Search: ");
                            String searchname=in.next();
                            boolean foundname=false;
                            int cout=0;
                        
                            for (String x : crushies) {
                                if (searchname.equalsIgnoreCase(x)) {
                                    foundname=true;
                                }
                                if (!searchname.equalsIgnoreCase(x)) {
                                    continue;
                                }
                                cout++;
                            }
                        
                            if (foundname) {
                                System.out.println("There is "+cout+" in the list! "+searchname+" is found!");
                            } else {
                                System.out.println("There is "+cout+" in the list! "+searchname+" is not found!");
                            }
                        } else {
                            System.out.println("Incorrect Password!!");
                        }
                    }
                break;
                
                // Determine who MATCHES you the most AYIEEEE!!!!
                case "match":
                    if (count==0) {
                        System.out.println("Input your Crush(es) first!!");
                    } else {
                        if (lock.equals("")) {
                            int y=1;
                            for (String x : crushies) {
                                System.out.println(y+". "+x+" = "+(int)(Math.random()*101)+"%");
                                y++;
                            }
                        } else {
                            System.out.print("Enter password: ");
                            String pass=in.next();
                            
                            if (pass.equals(lock)) {
                                int y=1;
                                for (String x : crushies) {
                                    System.out.println(y+". "+x+" = "+(int)(Math.random()*101)+"%");
                                    y++;
                                }
                            } else {
                                System.out.println("Incorrect Password!!");
                            }
                        }
                    }
                break;
                
                // Seek HELP wag mataas ang pride!!
                case "help":
                    System.out.println("Add: enter your crush(es).");
                    System.out.println("Lock: put some password to your list.");
                    System.out.println("Display: display your crush(es).");
                    System.out.println("Search: search for your crush.");
                    System.out.println("MATCH: see who matches you the most.");
                break;
                
                // EXIT the program
                case "exit":
                    System.out.println("Exiting program....");
                break;
                
                // Wrong Inputted Choice
                default:
                    System.out.println("Invalid Choice!!");
            }
        } while (!choice.equalsIgnoreCase("exit"));
        
    }
}
