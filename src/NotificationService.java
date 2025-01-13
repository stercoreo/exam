import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private static NotificationService instance;
    private List<User> subscribers = new ArrayList<>();

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void subscribe(User user) {
        subscribers.add(user);
    }

    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    public void notifySubscribers(Notification notification) {
        for (User user : subscribers) {
            user.update(notification);
        }
    }
}
