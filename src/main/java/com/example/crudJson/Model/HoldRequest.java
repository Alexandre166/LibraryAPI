package com.example.crudJson.Model;

import java.util.Date;

public class HoldRequest {

    Borrower borrower;
    Book book;
    Date date;

    public HoldRequest(Borrower borrower, Book book, Date date) {
        this.borrower = borrower;
        this.book = book;
        this.date = date;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Book getBook() {
        return book;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "HoldRequest{" +
                "borrower=" + borrower +
                ", book=" + book +
                ", date=" + date +
                '}';
    }
}
