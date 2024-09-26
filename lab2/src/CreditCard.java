public class CreditCard  implements  PaymentMethod{ public void processPayment(double amount) {
    System.out.println("Paid $" + amount + " Credit Card.");
}
}
