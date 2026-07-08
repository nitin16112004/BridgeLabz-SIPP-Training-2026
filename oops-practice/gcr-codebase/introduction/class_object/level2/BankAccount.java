class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Prachi", 12345, 10000);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Account Number: " + account.accountNumber);

        account.displayBalance();

        account.deposit(2000);
        account.displayBalance();

        account.withdraw(5000);
        account.displayBalance();

        account.withdraw(8000); 
    }
}