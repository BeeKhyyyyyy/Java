
package OLDIES;

import java.util.Arrays;
import java.util.Scanner;

public class KupalSiVan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // declaration of variables and array
        String [] games=new String[5];
        String email="naglalawayakosapepe@hotmail.com";
        String password="pogi123";
        String user, pass;
        int count=1, bilang=1;
        
        // welcome remarks
        System.out.println("Welcome to PinayFlex.com!");
        System.out.println("Please enter your email and password.");
        
        // log in site
        do {
            System.out.print("\nEnter email: ");
            user=in.nextLine();
            System.out.print("Enter password: ");
            pass=in.nextLine();
            
            if (!user.equals(email) || !pass.equals(password)) {
                System.out.println("Incorrect email or password! Try again!");
            } else {
                System.out.println("Log in successfully!");
            }
        } while (!user.equals(email) || !pass.equals(password));
        
        // enter 5 fave games
        System.out.println("\nEnter your top 5 favorite games");
        for (int x=0; x<games.length; x++) {
            System.out.print("Enter favorite game no. "+count+": ");
            games[x]=in.nextLine();
            count++;
        }
        
        // display 5 fave games
        Arrays.sort(games);
        System.out.println("\n"+email+"'s Top 5 Favorite Games");
        for (String x : games) {
            System.out.println(bilang+". "+x);
            bilang++;
        }        
    }
}
