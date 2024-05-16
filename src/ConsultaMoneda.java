import com.google.gson.Gson;
// import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda(String monedaBase, String monedaDestino, float cantidad) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ed9a69f93d2b893842cfde01/pair/"+ monedaBase
                + "/" + monedaDestino + "/" + String.valueOf(cantidad));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client                                                                                                                                                         
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }
}
