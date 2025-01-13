public class SentState implements NotificationState {
    @Override
    public void handleState(Notification notification) {
        System.out.println("Notification has been sent.");
        notification.setState(new DeliveredState());
    }
}
