package com.example.crudJson.Model;

public class Person {
    private String name, password, adress;
    private int age, id, phoneNumber;

    public Person(String name, int age, String password, String adress, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber;
    }
}
