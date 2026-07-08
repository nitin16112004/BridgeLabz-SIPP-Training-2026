class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    // Static field to track total accounts
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println(holder +
                    " withdrawal failed! Insufficient balance.");
        }
    }

    // Display account statement
    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("-----------------------------");
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
