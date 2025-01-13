public class Main {
    public static void main(String[] args) {
        // Singleton instance
        NotificationService notificationService = NotificationService.getInstance();

        // Users subscribing
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);

        // Notification
        Notification notification = new Notification("Big sale on electronics!");
        notificationService.notifySubscribers(notification);

        // Process states
        notification.processState();
        notification.processState();
        notification.processState();

        // Decorator
        Message message = new BasicMessage("Exclusive offers!");
        message = new EncryptedMessage(message);
        message = new AdvertisementMessage(message);
        System.out.println(message.getContent());
    }
}
