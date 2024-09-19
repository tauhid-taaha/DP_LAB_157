//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();


        NotificationService notificationService = new InAppNotificationService();


        Rider rider = new Rider(1, "Alice", "Downtown", paypal);
        Driver driver = new Driver(101, "Bob", "Luxury", "Uptown");

        Vehicle luxuryCar = new Vehicle("Luxury Car", "AB1234", 4);


        Admin admin = new Admin(201, "John", "Manager");


        rider.requestRide("Downtown", "Uptown", RideType.LUXURY);
    }
}