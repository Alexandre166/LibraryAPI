package com.example.crudJson.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HoldRequest {

    Borrower borrower;
    Book book;
    Date date;

    LocalDateTime dataHoraAtual = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String dataHoraFormatada = dataHoraAtual.format(formatter);

    public HoldRequest(Borrower borrower, Book book) {
        this.borrower = borrower;
        this.book = book;
        this.date = new Date(dataHoraFormatada);
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
