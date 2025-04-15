package com.example.crudJson.Control;

import com.example.crudJson.Model.Person;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class userCRUD {
    public void create(){
        try (FileWriter fileWriter = new FileWriter("C:/Users/AlexandreN/JAVA_Desenvolvimento/crudJson/src/main/resources/jsonTeste.json", true)) {

        } catch (IOException e) {
            System.out.println("An error occurred while writing the JSON file: " + e.getMessage());
        };
    }

    public void read(){

    }

}
