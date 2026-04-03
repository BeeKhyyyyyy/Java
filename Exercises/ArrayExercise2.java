
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
public class ArrayExercise2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // size of the array
        int size;
        
        // input size of the array
        do {
            System.out.print("Enter the size of the array: ");
            size=in.nextInt();
            
            // repeat if array size is LESS than 0
            if (size<=0) {
                System.out.println("The size of array must be GREATER than 0!\n");
            }
        } while (size<=0);
        
        // declaration of array
        int num[]=new int[size];
        
        // user input
        System.out.println("");
        for (int x=0; x<size; x++) {
            System.out.print("Enter num at index "+x+": ");
            num[x]=in.nextInt();
        }
        
        // check if prime or composite number
        String none="", prime="", composite="";
        for (int x=0; x<size; x++) {
            
            int count=0;
            for (int i=1; i<=num[x]; i++) {
                if (num[x]%i==0) {
                    count++;
                }
            }
            
            // neither prime nor composite number
            if (num[x]<=1) {
                none+=num[x]+" ";
            }
            
            // if prime number
            else if (count==2) {
                prime+=num[x]+" ";
            }
            
            // if composite number
            else {
                composite+=num[x]+" ";
            }
        }
        
        // output
        System.out.println("\nPrime Numbers: "+prime);
        System.out.println("Composite Numbers: "+composite);
        System.out.println("Neither of the Two: "+none);
    }
}
