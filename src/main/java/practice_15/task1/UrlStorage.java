package practice_15.task1;

public interface UrlStorage {
    void save(String shortKey, String longUrl);
    String find(String shortKey);
}
