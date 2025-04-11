package com.example.crudJson.Model;

public class Staff extends Person {
    protected double salary;

    public Staff(String name, int age, String password, String adress, int phoneNumber, double salary) {
        super(name, age, password, adress, phoneNumber);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"," +
                "salary=" + salary +
                '}';
    }
}
