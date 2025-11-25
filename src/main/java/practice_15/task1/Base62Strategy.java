package practice_15.task1;

public class Base62Strategy implements ShorteningStrategy{
    private static final String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String generateKey(String longUrl) {
        int hash = Math.abs(longUrl.hashCode());
        StringBuilder key = new StringBuilder();
        while (hash > 0) {
            key.append(CHARS.charAt(hash % 62));
            hash /= 62;
        }
        return key.toString();
    }
}
