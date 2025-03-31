package java_constructors;

class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        account.deposit(500);
        account.withdraw(300);
        account.displayAccountInfo();
    }
}
