import java.util.*;

public class Stack {
    // Initializing scanner class and top variable
    static Scanner in=new Scanner(System.in);
    static int top=-1;
    
    // Main class
    public static void main(String[] args) {
        // Initialization of the size of the stack array
        System.out.print("Enter stack array size: ");
        int maxSize=in.nextInt();
        int[] stackArray=new int[maxSize];
        
        // Choice variable and main-menu driven interface
        int choice;
        do {
            // Menu interface
            System.out.println("\n1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Display stack array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice=in.nextInt();
            System.out.println("");
            
            // Options
            switch (choice) {
                case 1:   // PUSH operation
                    System.out.print("Enter the value you want to push into stack: ");
                    int value=in.nextInt();
                    push(value, maxSize, stackArray);
                    break;
                    
                case 2:   // POP operation
                    pop(stackArray);
                    break;
                    
                case 3:   // Displays stack array
                    displayStack(stackArray);
                    break;
                    
                case 4:   // Exit
                    System.out.println("Exiting system....");
                    break;
                    
                default:  // Executes if choice is invalid
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);   // Continues while choice is not equal to 4
    }
    
    // PUSH operation
    static void push(int value, int maxSize, int[] stackArray) {
        if (top == maxSize-1) {   // Executes if stack is empty
            System.out.println("Stack overflow! Cannot push " + value);
        } else {   // Else, the value will be pushed into stack
            stackArray[++top]=value;
            System.out.println(value + " pushed into stack.");
        }
    }
    
    // POP operation
    static int pop(int[] stackArray) {
        if (top == -1) {   // Executes if stack is empty
            System.out.println("Stack underflow! Cannot pop");
            return -1;
        } else {   // Else, the top value will be popped from the stack
            int value=stackArray[top--];
            System.out.println(value + " popped from stack.");
            return value;
        }
    }
    
    // Displays the stack array
    static void displayStack(int[] stackArray) {
        System.out.println("Stack Array (Bottom -> Top):");
        if (top == -1) {   // Executes if stack is empty
            System.out.println("Stack is empty.");
        } else {   // Else, the stack array contents will be displayed from bottom to top
            for (int i=0; i<=top; i++) {
                System.out.print(stackArray[i] + (i<=top ? " " : ""));
            }
            System.out.println("");
        }
    }
}
