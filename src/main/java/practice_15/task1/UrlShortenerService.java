package practice_15.task1;

public class UrlShortenerService {
    private UrlStorage storage;
    private ShorteningStrategy strategy;
    private String domain;

    public UrlShortenerService(ShorteningStrategy strategy) {
        this.storage = new InMemoryUrlStorage();
        this.strategy = strategy;
        this.domain = "https://short.url";
    }

    public String shortenUrl(String longUrl) {
        String shortKey = strategy.generateKey(longUrl);
        storage.save(shortKey, longUrl);
        return domain + "/" + shortKey;
    }

    public String expandUrl(String shortUrl) {
        String shortKey = shortUrl.substring(domain.length() + 1);
        return storage.find(shortKey);
    }
}
