package practice_15.task2;

public class Stream {
    private String videoId;
    private String format;

    public Stream(String videoId, String format) {
        this.videoId = videoId;
        this.format = format;
    }

    public String getVideoId() { return videoId; }
    public String getFormat() { return format; }

}
