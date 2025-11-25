package practice_15.task2;

public interface VideoAdapter {
    Video convertToMp4(String filePath);
    boolean supports(String format);
}
