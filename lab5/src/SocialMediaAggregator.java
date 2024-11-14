import java.util.List;

public class SocialMediaAggregator {
    private final List<SocialMediaService> services;

    public SocialMediaAggregator() {
        services = new ArrayList<>();
        // Initialize supported services
        services.add(SocialMediaServiceFactory.getService("twitter"));
        services.add(SocialMediaServiceFactory.getService("facebook"));
        services.add(SocialMediaServiceFactory.getService("linkedin"));
    }

    public List<Notification> getAllNotifications() {
        List<Notification> allNotifications = new ArrayList<>();
        for (SocialMediaService service : services) {
            allNotifications.addAll(service.fetchNotifications());
        }
        return allNotifications;
    }

    public void markNotificationAsRead(String notificationId, String platform) {
        getService(platform).markAsRead(notificationId);
    }

    public void markNotificationAsUnread(String notificationId, String platform) {
        getService(platform).markAsUnread(notificationId);
    }

    public void deleteNotification(String notificationId, String platform) {
        getService(platform).deleteNotification(notificationId);
    }

    private SocialMediaService getService(String platform) {
        return services.stream()
                .filter(service -> service.getClass().getSimpleName().equalsIgnoreCase(platform + "Service"))
                .findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("Platform not supported"));
    }
}
