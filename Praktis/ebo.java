
import java.util.*;

class Cinema {
    boolean[][] seats=new boolean[3][5];
    
    Cinema(boolean[][] seats) {
        this.seats=seats;
    }
    
    public void displaySeats() {
        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                System.out.print("A"+j);
            }
        }
    }
}
