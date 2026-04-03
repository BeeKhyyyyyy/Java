// Main class named BankAccount
public class BankAccount {
    // Attributes (fields) including the static variable
    int accountNumber;
    String accountHolder;
    double balance;
    static int nextAccountNumber=1000;
    
    // Constructor (to initialize objects)
    BankAccount(String accountHolder) {
        this.accountHolder=accountHolder;
        accountNumber=nextAccountNumber;
        balance=0;
        nextAccountNumber++;
    }
    
    // Public method to deposit money
    public void Deposit() {
        balance+=500;
        System.out.println(">Money added successfully to account ("+accountHolder+")!");
        System.out.println("Current balance: "+balance+"\n");
    }
    
    // Public method to withdraw money
    public void Withdraw() {
        /* Money will not be withdrawn if the balance is equal or less than 0 and balance
        is less than the amount of money to be withdrawn. Else, it will be withdrawn */
        if (balance<=0) {
            System.out.println(">Deposit money to your account ("+accountHolder+") first!\n");
        } else if (balance<150) {
            System.out.println(">Cannot withdraw! Insufficient money to account ("+accountHolder+")!\n");
        } else {
            balance-=150;
            System.out.println(">Money withdrawed successfully to account ("+accountHolder+")!");
            System.out.println("Current Balance: "+balance+"\n");
        }
    }
    
    // Public method to display account, including accNumber, accName, and balance
    public void ToString() {
        System.out.println("Account Number          :   "+accountNumber);
        System.out.println("Account Holder's Name   :   "+accountHolder);
        System.out.println("Balance                 :   "+balance+"\n");
    }
    
    // Main method
    public static void main(String[] args) {
        // Creating 2 objects of the BankAccount class
        BankAccount account1=new BankAccount("Agapito");
        BankAccount account2=new BankAccount("Agatha");
        
        // Calling methods on the object
        account1.ToString();
        account2.ToString();
        account1.Withdraw();
        account2.Deposit();
        account1.Deposit();
        account2.Withdraw();
        account1.Withdraw();
        account1.Withdraw();
        account1.Withdraw();
        account1.Withdraw();
        account2.ToString();
        account1.ToString();
    }
}
