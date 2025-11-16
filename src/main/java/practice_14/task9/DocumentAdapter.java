package practice_14.task9;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfProcessor;


    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        pdfProcessor.process();
        System.out.println("Конвертирую PDF в DOC");
    }
}
