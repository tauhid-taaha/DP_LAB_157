import java.util.Map;
public class CreateAccountCommand  implements  Command{

    private String accountNumber;
    private double initialDeposit;
    private Map<String, BankAccount> accountMap;

    CreateAccountCommand(String accountNumber, double initialDeposit, Map<String, BankAccount> accountMap) {
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
        this.accountMap = accountMap;
    }

    public void execute() {
        if (!accountMap.containsKey(accountNumber)) {
            BankAccount account = new BankAccount(accountNumber, initialDeposit);
            accountMap.put(accountNumber, account);
            TransactionHistory.addTransaction(accountNumber, "Account Created with initial deposit $" + initialDeposit);
        } else {
            System.out.println("Account already exists!");
        }
    }
}
