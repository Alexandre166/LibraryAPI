package com.example.crudJson;

import com.example.crudJson.Model.Staff;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class CrudJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJsonApplication.class, args);

		Staff s1 = new Staff("Joshwa", "127", "@gmail.com", 27, 123, 1500);
		System.out.println(s1);


	}

}
