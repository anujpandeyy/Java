package java_inner_classes;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        BankAccount.Transaction transaction = account.new Transaction(500);
        transaction.processTransaction();
        System.out.println("Updated Balance: " + account.getBalance());
    }
}

class BankAccount {
    double balance;

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    class Transaction {
        double amount;

        public Transaction(double amount) {
            this.amount = amount;
        }

        public void processTransaction() {
            balance += amount;
        }
    }
}
