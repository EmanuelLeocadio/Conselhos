import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
   
    
    public String NumAleatorio( String numero){
  String conselho = "https://api.adviceslip.com/advice/" + numero;
  HttpClient cliente = HttpClient.newHttpClient();
  HttpRequest request = HttpRequest.newBuilder()
       .uri(URI.create(numero)).build();
       HttpResponse<String> response;

    try {
        response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();


    } catch (IOException | InterruptedException e) {
     e.printStackTrace();
    }




return "";


    }
}
