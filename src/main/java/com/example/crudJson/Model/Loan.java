package com.example.crudJson.Model;

import java.util.Date;

public class Loan {
    private Date issueDate, returnedDate;
    private boolean finePaid;

    public Loan(Date issueDate, Date returnedDate, boolean finePaid) {
        this.issueDate = issueDate;
        this.returnedDate = returnedDate;
        this.finePaid = finePaid;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public boolean isFinePaid() {
        return finePaid;
    }

    public double computeFine(){
        return finePaid ? 1.00 : 0.0;
    }

    public void payFine(){}

    public void renewIssuedBook(Date renewDate){

    }


}
