import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscasApis {

    public String googleBooks(String busca) throws IOException, InterruptedException {
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;
        return requisicaoApi(endereco);
    }

    public String coinGecko(String busca, String moeda) throws IOException, InterruptedException {
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca +"&vs_currencies=" + moeda;
        return requisicaoApi(endereco);
    }
    public String theMealDB(String busca) throws IOException, InterruptedException {
        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;
        return requisicaoApi(endereco);
    }
    public HttpResponse<String> github(String busca) throws IOException, InterruptedException {
        String endereco = "https://api.github.com/users/" + busca;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }


    //METODO GET
    public String requisicaoApi(String endereco) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        return response.body();
    }
}
