package java_encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber("1234ABCXYZ");
        obj.setBalance(1000);
        obj.deposit(500);
        obj.withdraw(200);
        System.out.println(obj.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            System.out.println("You do not have money :(");
            return balance;
        } else {
            balance -= amount;
        }
        return balance;
    }

}