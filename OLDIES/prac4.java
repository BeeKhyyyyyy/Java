
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac4 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        
        // Initialization
        String names[]={"Khyron B. Rafael", "Shinta", "Kaoruko Waguri"};
        String choice;
        
        // Welcome Pooo
        System.out.println("Welcome to the Hall of Fame!");
        System.out.println("The place where the LEGENDS are known.");
        
        do {
            // Options
            System.out.println("\n***************O P T I O N S***************");
            System.out.println("-Display");
            System.out.println("-Find");
            System.out.println("-Search");
            System.out.println("-Trivia (Quiz)");
            System.out.println("-Help");
            System.out.println("-Exit");
            System.out.println("*******************************************");
        
            // Input your Choice
            System.out.print("How may I help you? ");
            choice=in.nextLine();
            System.out.println("");
            
            // Choices Flow
            switch (choice.toLowerCase()) {
                // Display the Hall of FAMERS
                case "display":
                    System.out.println("Hall of FAMERS:");
                    int i=1;
                    for (int x=0; x<names.length; x++) {
                        System.out.println(i+". "+names[x]);
                        i++;
                    }
                break;
                
                // Search for a Hall of FAMER
                case "find":
                    System.out.print("Search for a Hall of FAMER: ");
                    String searchname=in.nextLine();
                    boolean foundname=false;
                    
                    for (int x=0; x<names.length; x++) {
                        if (searchname.equalsIgnoreCase(names[x])) {
                            foundname=true;
                            break;
                        }
                    }
                    
                    if (foundname) {
                        System.out.println(searchname+" is a Hall of FAMER!!");
                    } else {
                        System.out.println(searchname+" is not a Hall of FAMER!");
                    }
                break;
                
                // Search for a Hall of FAMER you want to know
                case "search":
                    System.out.print("Who do you want to know? ");
                    String search=in.nextLine();
                    
                    switch (search.toLowerCase()) {
                        case "khyron b. rafael":
                            System.out.println("\nKhyron B. Rafael");
                            System.out.println("\n-Khyron Brofar Rafael is a GOAT who is known for his mastery and significant contribution to the technology");
                            System.out.println("that lead to the development and advancement of both hardware and software, which ultimately changed the world");
                            System.out.println("in a beautiful and perfect way. He amazed the world with his programming and technology skills");
                            System.out.println("\n-He is a successful entrepreneur, with a net worth of over 999 trillion USD. He is the owner and the CEO of");
                            System.out.println("the famous company known as Wetpakners, which is the peak and ultimate contributor of innovation. He is good");
                            System.out.println("at many things, which earned him the title of \"Jack of All Trades\" and \"Peak of Humanity.\"");
                            System.out.println("\nBorn: October 25, 2005");
                            System.out.println("Status: Alive");
                            System.out.println("Civil Status: Married");
                            System.out.println("Occupation: Entrepreneur");
                            System.out.println("Motto: \"With great cramming comes great responsibility, so if due today, do today.\"");
                            System.out.println("       \"Time is GOLD while watching BOLD.\"");
                        break;
                        
                        case "shinta":
                            System.out.println("\nShinta");
                            System.out.println("\n-Shinta is a GOAT who is known to rival Khyron. He is the 2nd best next to Khyron, and is known as the");
                            System.out.println("\"Father of Time Machine.\"");
                            System.out.println("\n-He invented the Time Machine, with the help of Khyron B. Rafael.");
                            System.out.println("\nBorn: December 1, 2004");
                            System.out.println("Status: Deceased");
                            System.out.println("Civil Status: Married");
                            System.out.println("Occupation: Data Analyst");
                            System.out.println("Motto: \"If nothing goes left, go right.\"");
                        break;
                        
                        case "kaoruko waguri":
                            System.out.println("\nKaoruko Waguri");
                            System.out.println("\n-Kaoruko Waguri or Kaoruko W. Rafael is a GOAT who is known for her programming/coding skills.");
                            System.out.println("She is a Goddess who is known for her beauty inside-out because she is very beautiful, kind,");
                            System.out.println("and is the greenest flag you'll ever see.");
                            System.out.println("\n-She is the loving wife of Khyron B. Rafael, and is considered as \"The Standard\" because");
                            System.out.println("she is the ideal woman of every man.");
                            System.out.println("\nBorn: July 22, 2005");
                            System.out.println("Status: Alive");
                            System.out.println("Civil Status: Married");
                            System.out.println("Occupation: Software Engineer & AI/Network Architect");
                            System.out.println("Motto: \"All dreams can come true, if we have the courage to pursue.\"");
                        break;
                            
                        default:
                            System.out.println("Please enter the right person on the list or enter the full name.");
                    }
                break;
                
                // Trivial Quiz
                case "trivia":
                    System.out.println("She is a Goddess for her beauty who is known for her skills,");
                    System.out.println("and is the wife of Khyron B. Rafael.");
                    System.out.println("\nNote: Please type the correct answer with full name,");
                    System.out.println("correct capitalization, and correct punctuation. Good Luck!");
                    System.out.print("\nEnter your answer: ");
                    String answer=in.nextLine();
                    
                    if (answer.equals("Kaoruko Waguri")) {
                        System.out.println("CORRECT! Congratulations!!");
                    } else {
                        System.out.println("WRONG! Better luck next time.");
                    }
                break;
                
                // Trivial Quiz (if quiz was entered instead of trivia)
                case "quiz":
                    System.out.println("She is a Goddess for her beauty who is known for her skills,");
                    System.out.println("and is the wife of Khyron B. Rafael.");
                    System.out.println("\nNote: Please type the correct answer with full name,");
                    System.out.println("correct capitalization, and correct punctuation. Good Luck!");
                    System.out.print("\nEnter your answer: ");
                    String answer2=in.nextLine();
                    
                    if (answer2.equals("Kaoruko Waguri")) {
                        System.out.println("CORRECT! Congratulations!!");
                    } else {
                        System.out.println("WRONG! Better luck next time.");
                    }
                break;
                
                // Help for Directions
                case "help":
                    System.out.println("Display: show all the Hall of Famers.");
                    System.out.println("Find: search for a Hall of Famer.");
                    System.out.println("Search: search for a Hall of Famer you want to know.");
                    System.out.println("Trivia: a trivial quiz about a Hall of Famer.");
                break;
                
                // Leave the Program
                case "exit":
                    System.out.println("Exiting program....");
                break;
                
                // Invalid Choice
                default:
                    System.out.println("Please enter the correct option!");
            }
        } while (!choice.equalsIgnoreCase("Exit"));
        
    }
}
