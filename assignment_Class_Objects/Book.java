package assignment_Class_Objects;
class Book_Details{
	  private String title;
	  private String author;
	  private String isbn;
	  private double price;
	  private static int book_id=0;
	  
	  public Book_Details(String title, String author, String isbn, double price){
	    this.title = title;
	    this.author = author;
	    this.isbn = isbn;
	    this.price = price;
	    book_id++;
	  }
	  public void setTitle(String title){
	    this.title = title;
	  }
	  public String getTitle(){
	    return title;
	  }
	  public void setAuthor(String author){
	    this.author = author;
	  }
	  public String getAuthor(){
	    return author;
	  }
	  public void setIsbn(String isbn){
	    this.isbn = isbn;
	  }
	  public String getIsbn(){
	    return isbn;
	  }
	  public void setPrice(double price){
	    this.price = price;
	  }
	  public double getPrice(){
	    return price;
	  }
	  public int getTotalBooks(){
	    return book_id;
	  }
	  public String toString()
	  {
		  return this.book_id+"\n"+this.title+"\n"+this.author+"\n"+this.isbn+"\n"+this.price;
	  }
	}
	class Book{
	  public static void main(String[] args) {
		Book_Details b1 = new Book_Details("JAVA", "James Gosling", "100001", 1500);
	    Book_Details b2 = new Book_Details("C", "Dennis Ritchie", "100002", 1450);
	    System.out.print(b1.toString());
	    System.out.print(b2.toString());
	  }
	}