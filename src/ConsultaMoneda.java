import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    Moneda consultarConversion(String monedaConvertir){
        var apiKey = "a141a60bce25b1ec9c1978d9";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+monedaConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("Conversion no disponible");
        }

    }


}
