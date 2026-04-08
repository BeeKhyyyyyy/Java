
package OLDIES;

import java.util.Scanner;

/**
 *
 * @author Wetpakner
 */
public class prac5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // Introduction
        System.out.println("Welcome to Temperature Converter!");
        System.out.println("SI Units: Celsius (°C), Kelvin (K), Fahrenheit (°F)");
        
        // Declaration of SIZE of Numbers
        int size;
        
        // Quantity of Numbers you want to CONVERT
        do {
            System.out.print("\nHow many numbers would you like to convert? ");
            size=in.nextInt();
            
            if (size<=0) {
                System.out.println("Enter number GREATER than 0!");
            }
        } while (size<=0);
        
        // Initialization
        double num[]=new double[size];
        char choice, cho;
        String unit;
        
        // Store Numbers
        System.out.println("");
        for (int x=0; x<size; x++) {
            System.out.print("Enter num"+x+": ");
            num[x]=in.nextInt();
        }
        
        // Program
        do {
            // SI Units
            System.out.println("\nSI Units: Celsius, Fahrenheit, Kelvin");
            System.out.print("Choose a unit: ");
            unit=in.next();
            
            // Units
            switch (unit.toLowerCase()) {
                // Celsius
                case "celsius":
                    do {
                        // Celsius Menu
                        System.out.println("\n----------O P T I O N S----------");
                        System.out.println("a. Formula");
                        System.out.println("b. Display Numbers");
                        System.out.println("c. Celsius --> Fahrenheit");
                        System.out.println("d. Celsius --> Kelvin");
                        System.out.println("e. Exit or Change Unit");
                        System.out.println("---------------------------------");
                        System.out.print("Enter your choice (a-e): ");
                        cho=in.next().toLowerCase().charAt(0);
                        System.out.println("");
                    
                        // Celsius Options
                        switch (cho) {
                            // Formula(s) for Celsius
                            case 'a':
                                System.out.println("Celsius to Fahrenheit: (°C × 9/5) + 32 = °F");
                                System.out.println("Celsius to Kelvin: °C + 273.15 = K");
                            break;
                            
                            // Display the Inputted Numbers
                            case 'b':
                                int y=0;
                                for (double x : num) {
                                    System.out.println("Num"+y+": "+x);
                                    y++;
                                }
                            break;
                            
                            // Celsius to Fahrenheit
                            case 'c':
                                for (double x : num) {
                                    double ans=(x * 9/5) + 32;
                                    System.out.printf(x+"°C --> %.1f°F\n",ans);
                                }
                            break;
                            
                            // Celsius to Kelvin
                            case 'd':
                                for (double x : num) {
                                    double ans=x + 273.15;
                                    System.out.printf(x+"°C --> %.1fK\n",ans);
                                }
                            break;
                            
                            // Exit or Change Unit
                            case 'e':
                                System.out.println("Exiting celsius unit....");
                            break;
                            
                            // Invalid Choice
                            default:
                                System.out.println("Invalid Choice!!");
                        }
                    } while (cho!='e');
                break;
                
                // Fahrenheit
                case "fahrenheit":
                    do {
                        // Fahrenheit Menu
                        System.out.println("\n----------O P T I O N S----------");
                        System.out.println("a. Formula");
                        System.out.println("b. Display Numbers");
                        System.out.println("c. Fahrenheit --> Celsius");
                        System.out.println("d. Fahrenheit --> Kelvin");
                        System.out.println("e. Exit or Change Unit");
                        System.out.println("---------------------------------");
                        System.out.print("Enter your choice (a-e): ");
                        cho=in.next().toLowerCase().charAt(0);
                        System.out.println("");
                    
                        // Fahrenheit Options
                        switch (cho) {
                            // Formula(s) for Fahrenheit
                            case 'a':
                                System.out.println("Fahrenheit to Celsius: (°F − 32) × 5/9 = °C");
                                System.out.println("Fahrenheit to Kelvin: (°F − 32) × 5/9 + 273.15 = K");
                            break;
                            
                            // Display the Inputted Numbers
                            case 'b':
                                int y=0;
                                for (double x : num) {
                                    System.out.println("Num"+y+": "+x);
                                    y++;
                                }
                            break;
                            
                            // Fahrenheit to Celsius
                            case 'c':
                                for (double x : num) {
                                    double ans=(x - 32) * 5/9;
                                    System.out.printf(x+"°F --> %.1f°C\n",ans);
                                }
                            break;
                            
                            // Fahrenheit to Kelvin
                            case 'd':
                                for (double x : num) {
                                    double ans=(x - 32) * 5/9 + 273.15;
                                    System.out.printf(x+"°F --> %.1fK\n",ans);
                                }
                            break;
                            
                            // Exit or Change Unit
                            case 'e':
                                System.out.println("Exiting fahrenheit unit....");
                            break;
                            
                            // Invalid Choice
                            default:
                                System.out.println("Invalid Choice!!");
                        }
                    } while (cho!='e');
                break;
                
                // Kelvin
                case "kelvin":
                    do {
                        // Kelvin Menu
                        System.out.println("\n----------O P T I O N S----------");
                        System.out.println("a. Formula");
                        System.out.println("b. Display Numbers");
                        System.out.println("c. Kelvin --> Celsius");
                        System.out.println("d. Kelvin --> Fahrenheit");
                        System.out.println("e. Exit or Change Unit");
                        System.out.println("---------------------------------");
                        System.out.print("Enter your choice (a-e): ");
                        cho=in.next().toLowerCase().charAt(0);
                        System.out.println("");
                    
                        // Kelvin Options
                        switch (cho) {
                            // Formula(s) for Kelvin
                            case 'a':
                                System.out.println("Kelvin to Celsius: K − 273.15 = °C");
                                System.out.println("Kelvin to Fahrenheit: (K − 273.15) × 9/5 + 32 = °F");
                            break;
                            
                            // Display the Inputted Numbers
                            case 'b':
                                int y=0;
                                for (double x : num) {
                                    System.out.println("Num"+y+": "+x);
                                    y++;
                                }
                            break;
                            
                            // Kelvin to Celsius
                            case 'c':
                                for (double x : num) {
                                    double ans=x - 273.15;
                                    System.out.printf(x+"K --> %.1f°C\n",ans);
                                }
                            break;
                            
                            // Kelvin to Fahrenheit
                            case 'd':
                                for (double x : num) {
                                    double ans=(x - 273.15) * 9/5 + 32;
                                    System.out.printf(x+"K --> %.1f°F\n",ans);
                                }
                            break;
                            
                            // Exit or Change Unit
                            case 'e':
                                System.out.println("Exiting fahrenheit unit....");
                            break;
                            
                            // Invalid Choice
                            default:
                                System.out.println("Invalid Choice!!");
                        }
                    } while (cho!='e');
                break;
                
                default:
                    System.out.println("Invalid Choice!!");
            }
            
            // Continue or Not?
            do {
                System.out.print("\nDo you wish to continue? (Y|N): ");
                choice=in.next().toUpperCase().charAt(0);
                
                if (choice!='Y' && choice!='N') {
                    System.out.println("Please enter Y if yes or N if no only!");
                } else if (choice=='N') {
                    System.out.println("Exiting program....");
                }
            } while (choice!='Y' && choice!='N');
        } while (choice!='N');
        
    }
}
