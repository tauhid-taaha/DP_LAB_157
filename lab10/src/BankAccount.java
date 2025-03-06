import java.util.*;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        System.out.println("Account Created: " + accountNumber + " | Balance: $" + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal!");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | New Balance: $" + balance);
            return true;
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }
}




