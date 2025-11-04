package Example2;

import java.util.List;

public class NotificationSender{

    public void sendNotification(List<Notification> notifications, String message, String recipient) {
      for (Notification notification : notifications) {
          notification.sendNotification(message, recipient);
      }
    }
}
