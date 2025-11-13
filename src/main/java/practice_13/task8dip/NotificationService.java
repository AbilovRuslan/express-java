package practice_13.task8dip;

public class NotificationService {
    private MessageService messageService;

    public void sendNotification(String message) {
        messageService.send(message);
    }
}
