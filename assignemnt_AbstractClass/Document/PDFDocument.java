package assignemnt_AbstractClass.Document;

public class PDFDocument extends Document {

    public PDFDocument(String title, int sizeInKB) {
        super(title, sizeInKB);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF in Adobe Reader...");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF file.");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}