package practice_14.task9;

import java.io.File;

public class DOCProcessor implements DocumentProcessor {
    private File doc;

    public DOCProcessor(File doc) {
        this.doc = doc;
    }

    @Override
    public void process() {
        System.out.println("Обрабатываю DOC файл");
    }
}
