package practice_13.task8dip;

public class NotificationService {
    private final MessageService sender;

    public NotificationService(MessageService sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
