package com.example.crudJson.Model;

public class Librarian extends Staff{
    private int officeNumber;

    public Librarian(String name, int age, String password, String adress, int phoneNumber, double salary, int officeNumber) {
        super(name, age, password, adress, phoneNumber, salary);
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"" +
                "officeNumber=" + officeNumber +
                '}';
    }
}
