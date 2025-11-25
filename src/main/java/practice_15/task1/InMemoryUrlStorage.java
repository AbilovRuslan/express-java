package practice_15.task1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {
    private Map<String, String> storage = new HashMap<>();

    public void save(String shortKey, String longUrl) {
        storage.put(shortKey, longUrl);
    }

    public String find(String shortKey) {
        return storage.get(shortKey);
    }
}
