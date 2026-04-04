import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter nums[" + i + "]: ");
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        System.out.println("\nSum of all numbers in the array: " + sum);
    }
}
