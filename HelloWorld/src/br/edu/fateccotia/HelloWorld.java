package br.edu.fateccotia;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		System.out.println("Hello World!");
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o CEP: ");
		String cep = leitor.nextLine();
		//Outro método
		// String cep; (Antes do método main)
		//leitor.nextLine();
		cep = cep.replaceAll("[\\s-]", ""); //Eliminando espaços
		System.out.println(cep);
		
		String url = "https://viacep.com.br/ws/" + cep + "/json/";
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest req = HttpRequest.newBuilder(new URI(url)).build();
		HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
		System.out.println(res.body());
		
		leitor.close();
	}

}
