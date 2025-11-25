package practice_15.task1;

public class HashStrategy implements ShorteningStrategy{
    public String generateKey(String longUrl) {
        return Integer.toHexString(longUrl.hashCode());
    }
}
