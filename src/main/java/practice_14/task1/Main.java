package practice_14.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n1. Первое получение экземпляра:");
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        config1.printAllConfig();

        System.out.println("\n2. Второе получение экземпляра:");
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("\n3. Проверка, что это один и тот же объект:");
        System.out.println("config1 == config2: " + (config1 == config2));

        System.out.println("\n4. Использование конфигурации:");
        System.out.println("Имя приложения: " + config1.getConfig("app.name"));
        System.out.println("Версия: " + config1.getConfig("app.version"));

        System.out.println("\n5. Изменение конфигурации:");
        config1.setConfig("app.port", "9090");
        config1.setConfig("log.level", "DEBUG");

        config1.printAllConfig();
    }
}
