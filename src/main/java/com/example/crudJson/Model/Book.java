package com.example.crudJson.Model;

import com.google.gson.annotations.SerializedName;

public class Book {
    private int id;
    private String  title;
    private String author;
    private String subject;
    private boolean isIssued;

    public Book(int id, String title, String author, String subject, boolean isIssued) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.isIssued = isIssued;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isIssued() {
        return isIssued;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }

    public void returnBook(){
        this.isIssued = true;
    }

    public void issueBook(){
        if(!isIssued){
            throw new IllegalStateException("Book is issued");
        }
        this.isIssued = false;
    }
}
