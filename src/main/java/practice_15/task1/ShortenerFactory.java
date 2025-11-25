package practice_15.task1;

public class ShortenerFactory {
    public static ShorteningStrategy createStrategy(String type) {
        if ("base62".equals(type)) {
            return new Base62Strategy();
        } else {
            return new HashStrategy();
        }
    }
}
