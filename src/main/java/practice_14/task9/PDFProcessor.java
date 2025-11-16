package practice_14.task9;

import java.io.File;

public class PDFProcessor implements DocumentProcessor {
    private File pdf;

    public PDFProcessor(File pdf) {
        this.pdf = pdf;
    }

    @Override
    public void process() {
        System.out.println("Обрабатываю PDF файл");
    }
}

