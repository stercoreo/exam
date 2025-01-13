public class DeliveredState implements NotificationState {
    @Override
    public void handleState(Notification notification) {
        System.out.println("Notification has been delivered.");
    }
}
