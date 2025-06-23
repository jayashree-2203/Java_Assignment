package assignemnt_AbstractClass.Document;

public abstract class Document {
	protected String title;
    protected int sizeInKB;

    public Document(String title, int sizeInKB) {
        this.title = title;
        this.sizeInKB = sizeInKB;
    }
    public void printInfo() {
    	System.out.println("Title: " + title);
    	System.out.println("Size: " + sizeInKB + " KB");
    }
	public abstract void open();
	public abstract void close();
	public abstract String getType();
}
