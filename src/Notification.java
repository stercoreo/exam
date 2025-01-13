public class Notification {
    private String content;
    private NotificationState state;

    public Notification(String content) {
        this.content = content;
        this.state = new NewState();
    }

    public void setState(NotificationState state) {
        this.state = state;
    }

    public void processState() {
        state.handleState(this);
    }

    public String getContent() {
        return content;
    }
}
