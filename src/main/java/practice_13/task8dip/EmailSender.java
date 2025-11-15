package practice_13.task8dip;

public class EmailSender implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}