import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankManager invoker = new BankManager();
        Map<String, BankAccount> accountMap = new HashMap<>();

        // Create Accounts
        invoker.executeCommand(new CreateAccountCommand("1001", 500, accountMap));
        invoker.executeCommand(new CreateAccountCommand("1002", 300, accountMap));

        // Get Accounts
        BankAccount account1 = accountMap.get("1001");
        BankAccount account2 = accountMap.get("1002");

        // Perform Transactions
        invoker.executeCommand(new DepositCommand(account1, 200));
        invoker.executeCommand(new WithdrawCommand(account1, 100));
        invoker.executeCommand(new TransferCommand(account1, account2, 150));
        invoker.executeCommand(new WithdrawCommand(account2, 50));

        // Show Transaction Histories
        TransactionHistory.showHistory("1001");
        TransactionHistory.showHistory("1002");
    }



    }
