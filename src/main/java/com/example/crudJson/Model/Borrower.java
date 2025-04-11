package com.example.crudJson.Model;

public class Borrower extends Person{
    public Borrower(String name, int age, String password, String adress, int phoneNumber) {
        super(name, age, password, adress, phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void borrowedBooks(){

    }

    public void onHoldBooks(){

    }

    public void updateBorrowedInfo(){}

    public void addBorrowedBooks(){

    }

    public void addHoldRequests(){

    }

    public void removeHoldRequests(){

    }

    public void removeBorrowedBooks(){}


}
