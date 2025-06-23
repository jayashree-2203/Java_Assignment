package assignment_Packages.Library.transactions;

import java.util.Date;

import assignment_Packages.Library.members.*;
import assignment_Packages.Library.books.*;
public class Transactions {
    private Members member;
    private Book book;
    private Date date;

    public Transactions(Members member, Book book) {
        this.member = member;
        this.book = book;
        this.date = new Date();
        book.borrow();
    }

    public void returnBook() {
        book.returnBook();
    }

    public void printTransaction() {
        System.out.println(member + " borrowed \"" + book.getTitle() + "\" on " + date);
    }
}