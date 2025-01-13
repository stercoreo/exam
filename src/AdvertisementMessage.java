public class AdvertisementMessage extends MessageDecorator {
    public AdvertisementMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return message.getContent() + " [Ad: Buy Now!]";
    }
}
