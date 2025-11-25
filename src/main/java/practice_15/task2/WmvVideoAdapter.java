package practice_15.task2;

public class WmvVideoAdapter implements VideoAdapter {
    public Video convertToMp4(String filePath) {
        System.out.println("Converting WMV to MP4: " + filePath);
        String videoId = generateVideoId(filePath);
        return new Video(videoId, extractTitle(filePath), "MP4");
    }

    public boolean supports(String format) {
        return "wmv".equalsIgnoreCase(format);
    }

    private String generateVideoId(String filePath) {
        return "WMV_" + Math.abs(filePath.hashCode());
    }

    private String extractTitle(String filePath) {
        return filePath.substring(filePath.lastIndexOf("/") + 1);
    }
}
