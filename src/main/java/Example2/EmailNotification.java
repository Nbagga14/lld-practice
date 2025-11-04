package Example2;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        // Logic to send email notification
        System.out.println("Sending Email to " + recipient + " with message: " + message);
    }
}
