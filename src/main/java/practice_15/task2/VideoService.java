package practice_15.task2;

public class VideoService {
    private VideoAdapter[] adapters;

    public VideoService(VideoAdapter... adapters) {
        this.adapters = adapters;
    }

    public Video uploadVideo(String filePath) {
        String format = getFileFormat(filePath);

        for (VideoAdapter adapter : adapters) {
            if (adapter.supports(format)) {
                return adapter.convertToMp4(filePath);
            }
        }

        throw new IllegalArgumentException("Unsupported video format: " + format);
    }

    public Stream streamVideo(String videoId) {
        System.out.println("Streaming video in MP4 format, Video ID: " + videoId);
        return new Stream(videoId, "MP4");
    }

    private String getFileFormat(String filePath) {
        int dotIndex = filePath.lastIndexOf(".");
        if (dotIndex > 0) {
            return filePath.substring(dotIndex + 1).toLowerCase();
        }
        throw new IllegalArgumentException("Invalid file path: " + filePath);
    }
}
