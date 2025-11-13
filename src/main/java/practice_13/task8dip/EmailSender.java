package practice_13.task8dip;

public class EmailSender implements MessageService {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
