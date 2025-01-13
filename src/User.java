public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println(name + " received notification: " + notification.getContent());
    }
}
