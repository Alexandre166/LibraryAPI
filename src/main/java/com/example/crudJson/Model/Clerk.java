package com.example.crudJson.Model;

public class Clerk extends Staff{
    private int deskNumber;

    public Clerk(String name, String password, String adress, int age, int phoneNumber, double salary, int deskNumber){
        super(name, age, password, adress, phoneNumber, salary);
        this.deskNumber = deskNumber;
    }
    public int getDeskNumber() {
        return deskNumber;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "deskNumber=" + deskNumber +
                '}';
    }
}
