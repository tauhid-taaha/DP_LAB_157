public class EmailNotify  implements  NotificationService{ public void sendNotification(String message, NotificationMethod method) {
    System.out.println("Notification sent via Email: " + message);
}
}
