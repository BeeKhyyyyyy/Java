
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
public class NonStaticAct1 {
    public static void main(String[] args) {
        NonStaticAct1 ns=new NonStaticAct1();
        
        // declaration of array and even or odd numbers
        int [] num=ns.getNum();
        ns.displayNum(num);
    }
    
    // non-static method to create array
    public int[] getNum() {
        Scanner in=new Scanner(System.in);
        int [] num=new int[10];
        
        // user input to input elements on the array
        for (int i=0; i<10; i++) {
            System.out.print("Enter num ["+i+"]: ");
            num[i]=in.nextInt();
        }
        
        return num;
    }
    
    // non-static method to determine if num is even or odd number
    public void displayNum(int[] num) {
        String even="", odd="";
        
        // condition to determine whether even or odd number
        for (int i=0; i<10; i++) {
            if (num[i]%2==0) {
                even+=num[i]+" ";
            } else {
                odd+=num[i]+" ";
            }
        }
        
        // output
        System.out.println("\nList of Even numbers: "+even);
        System.out.println("List of Odd numbers: "+odd);
    }
}
