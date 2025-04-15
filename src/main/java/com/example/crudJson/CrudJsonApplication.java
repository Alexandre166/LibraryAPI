package com.example.crudJson;

import com.example.crudJson.Model.Book;
import com.example.crudJson.Model.Staff;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

@SpringBootApplication
public class CrudJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJsonApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the book: ");
		var busca = scanner.nextLine();

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://openlibrary.org/search.json?title=the+lord+of+the+rings"))
				.build();
		HttpResponse<String> response = null;
		try {
			response = client
					.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		Gson gson = new Gson();
		Book book1 = gson.fromJson(response.body(), Book.class);

		System.out.println(book1.getTitle());
	}
}
