package Example2;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        // Logic to send SMS notification
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
