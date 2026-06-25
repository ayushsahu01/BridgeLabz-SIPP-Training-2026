class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}