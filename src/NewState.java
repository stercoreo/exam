public class NewState implements NotificationState {
    @Override
    public void handleState(Notification notification) {
        System.out.println("Notification is new.");
        notification.setState(new SentState());
    }
}
