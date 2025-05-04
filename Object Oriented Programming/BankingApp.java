package Assignment1CSW_2;
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        setBalance(getBalance() + amount + interest);
        System.out.println("Deposited with Interest in Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal from Savings Account successful.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited in Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal from Current Account successful.");
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        // Create SavingsAccount
        Account savings = new SavingsAccount(1001, 5000.0, 5.0);

        // Create CurrentAccount
        Account current = new CurrentAccount(2001, 3000.0, 1000.0);

        // Perform transactions
        savings.deposit(2000);
        savings.withdraw(1000);
        System.out.println();
        savings.displayAccountDetails();
        
        System.out.println("\n------------------------\n");

        current.deposit(1500);
        current.withdraw(4000);
        System.out.println();
        current.displayAccountDetails();
    }
}
