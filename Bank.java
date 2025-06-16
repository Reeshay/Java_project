public class Bank {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ali", 1000.0);

        account.displayBalance();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
    }
}
