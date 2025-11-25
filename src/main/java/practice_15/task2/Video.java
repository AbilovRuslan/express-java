package practice_15.task2;

public class Video {
    private String id;
    private String title;
    private String format;

    public Video(String id, String title, String format) {
        this.id = id;
        this.title = title;
        this.format = format;
    }

    public String getId() { return id; }
    public String getFormat() { return format; }
}
