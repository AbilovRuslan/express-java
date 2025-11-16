package practice_14.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n1. Логгер еще не создан");
        // Убираем обращение к приватному полю
        System.out.println("Проверка lazy initialization...");

        System.out.println("\n2. Первый вызов getInstance():");
        Logger logger1 = Logger.getInstance();
        logger1.info("Первый логгер получен успешно");

        System.out.println("\n3. Второй вызов getInstance():");
        Logger logger2 = Logger.getInstance();
        logger2.info("Второй логгер получен успешно");

        System.out.println("\n4. Проверка, что это один и тот же объект:");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
    }
}
