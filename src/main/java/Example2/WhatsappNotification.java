package Example2;

public class WhatsappNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        // Logic to send WhatsApp notification
        System.out.println("Sending WhatsApp message to " + recipient + " with message: " + message);
    }
}
