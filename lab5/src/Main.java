import java.util.List;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SocialMediaAggregator aggregator = new SocialMediaAggregator();

        // Fetch all notifications
        List<Notification> notifications = aggregator.getAllNotifications();
        for (Notification notification : notifications) {
            System.out.println(notification.getContent());
        }

        // Mark a Twitter notification as read
        aggregator.markNotificationAsRead("notificationId123", "twitter");

        // Delete a Facebook notification
        aggregator.deleteNotification("notificationId456", "facebook");
        }
    }
