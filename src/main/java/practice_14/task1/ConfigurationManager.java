package practice_14.task1;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> config;

    private ConfigurationManager() {
        System.out.println("Инициализация менеджера конфигурации...");
        config = new HashMap<>();
        loadDefaultConfig();
        System.out.println("Менеджер конфигурации готов к работе");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadDefaultConfig() {
        config.put("app.name", "MyApplication");
        config.put("app.version", "1.0.0");
        config.put("app.port", "8080");
        config.put("app.debug", "true");
        config.put("log.level", "INFO");
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void setConfig(String key, String value) {
        config.put(key, value);
        System.out.println("Конфигурация обновлена: " + key + " = " + value);
    }

    public void printAllConfig() {
        System.out.println("\n--ТЕКУЩАЯ КОНФИГУРАЦИЯ--");
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
