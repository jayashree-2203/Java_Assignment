package assignemnt_AbstractClass.Document;

class TextDocument extends Document {

    public TextDocument(String title, int sizeInKB) {
        super(title, sizeInKB);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document in Notepad...");
    }

    @Override
    public void close() {
        System.out.println("Closing Text Document.");
    }

    @Override
    public String getType() {
        return "Text";
    }
}