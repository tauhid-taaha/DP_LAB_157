public class WithdrawCommand implements Command{
    private BankAccount account;
    private double amount;

    WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        if (account.withdraw(amount)) {
            TransactionHistory.addTransaction(account.getAccountNumber(), "Withdrew $" + amount);
        }
    }
}
