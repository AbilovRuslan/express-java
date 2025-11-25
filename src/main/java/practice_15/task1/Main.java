package practice_15.task1;

public class Main {
    public static void main(String[] args) {
        UrlShortenerService service = new UrlShortenerService(
                ShortenerFactory.createStrategy("base62")
        );

        String shortUrl = service.shortenUrl("https://example.com/very/long/url");
        String originalUrl = service.expandUrl(shortUrl);

        System.out.println("Short: " + shortUrl);
        System.out.println("Original: " + originalUrl);
    }
}
