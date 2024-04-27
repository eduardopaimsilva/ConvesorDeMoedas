package br.com.eduardo.conversor.classes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private static String apiKey;
    private static final String nomeDoArquivo = "./api.txt";


    // Método para ler a chave da API do arquivo de texto
    public static void lerApi() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo));
        apiKey = reader.readLine();
        reader.close();
    }

    // Método para iniciar a API com a chave especificada
    public static double inciaApi(String baseCode, String tagetCode, Double valorEntrada) throws IOException, InterruptedException {

        if (apiKey == null) {
            throw new IllegalStateException("A chave da API não foi definida corretamente. verifique api.txt ");
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + tagetCode + "/" + valorEntrada))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiRec apiRec = gson.fromJson(response.body(), ApiRec.class);
        return Double.parseDouble(apiRec.conversion_result());
    }

}
