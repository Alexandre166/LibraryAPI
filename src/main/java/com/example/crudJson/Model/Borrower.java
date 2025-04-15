package com.example.crudJson.Model;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Borrower extends Person{

    private ArrayList<Book> books;
    ArrayList<HoldRequest> requests;
    public Borrower(String name, int age, String password, String adress, int phoneNumber) {
        super(name, age, password, adress, phoneNumber);
        this.books = new ArrayList<>();
        this.requests = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void borrowedBooks(){

    }

    public void onHoldBooks(){

    }

    public void updateBorrowedInfo(){

    }

    public void addBorrowedBooks(Book book){
        if(book.isIssued()){
            HoldRequest request = new HoldRequest(this, book);
            requests.add(request);
            books.add(book);
        }
    }

    public void addHoldRequests(){

    }

    public void removeHoldRequests(){

    }

    public void removeBorrowedBooks(Book book){
        if(books.contains(book)){
            books.remove(book);
        }
    }
}
