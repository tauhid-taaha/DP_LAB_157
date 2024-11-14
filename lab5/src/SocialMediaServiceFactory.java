public class SocialMediaServiceFactory {
    public static SocialMediaService getService(String platformName) {
        return switch (platformName.toLowerCase()) {
            case "twitter" -> new TwitterService();
            case "facebook" -> new FacebookService();
            case "linkedin" -> new LinkedInService();
            default -> throw new UnsupportedOperationException("Platform not supported");
        };
    }
}
