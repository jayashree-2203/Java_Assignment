package assignemnt_AbstractClass.Document;

public class DocumentManager 
{
	 public static void main(String[] args) {
	        Document doc1 = new PDFDocument("Resume.pdf", 500);
	        Document doc2 = new TextDocument("Notes.txt", 50);
	        Document doc3 = new ImageDocument("Photo.jpg", 1200);

	        Document[] documents = {doc1, doc2, doc3};

	        for (Document doc : documents) {
	            System.out.println("Document Type: " + doc.getType());
	            doc.printInfo();
	            doc.open();
	            doc.close();
	            System.out.println("----------------------------");
	        }
	    }
}
