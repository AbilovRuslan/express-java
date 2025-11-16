package practice_14.task2;

public class Logger {
    private static Logger instance; // private поле - нельзя обращаться извне

    private Logger() {
        System.out.println("Инициализация логгера...");
        System.out.println("Логгер готов к работе");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        System.out.println("[INFO] " + java.time.LocalDateTime.now() + " - " + message);
    }
}
