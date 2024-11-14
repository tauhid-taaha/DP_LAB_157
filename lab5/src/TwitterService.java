import java.util.List;

public class TwitterService implements SocialMediaService{
    @Override
    public List<Notification> fetchNotifications() {
        // API call to Twitter to fetch notifications
        return new ArrayList<>();
    }

    @Override
    public void markAsRead(String notificationId) {
        // API call to Twitter to mark notification as read
    }

    @Override
    public void markAsUnread(String notificationId) {
        // API call to Twitter to mark notification as unread
    }

    @Override
    public void deleteNotification(String notificationId) {
        // API call to Twitter to delete notification
    }
}
