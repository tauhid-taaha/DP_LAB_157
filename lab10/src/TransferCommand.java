public class TransferCommand implements Command{
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public void execute() {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            TransactionHistory.addTransaction(fromAccount.getAccountNumber(),
                    "Transferred $" + amount + " to " + toAccount.getAccountNumber());
            TransactionHistory.addTransaction(toAccount.getAccountNumber(),
                    "Received $" + amount + " from " + fromAccount.getAccountNumber());
        }
    }
}
