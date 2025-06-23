package assignment_Packages.Library.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { 
    	return title; 
    }

    public boolean isAvailable() {
    	return isAvailable; 
    }

    public void borrow() {
    	isAvailable = false; 
    }

    public void returnBook() { 
    	isAvailable = true; 
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}

