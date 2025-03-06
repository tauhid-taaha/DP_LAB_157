import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


class TransactionHistory {
    private static final Map<String, List<String>> history = new HashMap<>();

    static void addTransaction(String accountNumber, String transaction) {
        history.computeIfAbsent(accountNumber, k -> new ArrayList<>()).add(transaction);
    }

    static void showHistory(String accountNumber) {
        System.out.println("\nTransaction History for Account " + accountNumber + ":");
        List<String> transactions = history.getOrDefault(accountNumber, new ArrayList<>());
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}