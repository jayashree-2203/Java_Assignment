package assignemnt_AbstractClass.Document;

public class ImageDocument extends Document {

    public ImageDocument(String title, int sizeInKB) {
        super(title, sizeInKB);
    }

    @Override
    public void open() {
        System.out.println("Opening Image in Photo Viewer...");
    }

    @Override
    public void close() {
        System.out.println("Closing Image.");
    }

    @Override
    public String getType() {
        return "Image";
    }
}
