public class Digital implements PaymentMethod { public void processPayment(double amount) {
    System.out.println("Paid $" + amount + " via Digital Wallet.");
}
}
