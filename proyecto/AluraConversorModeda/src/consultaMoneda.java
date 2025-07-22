import com.google.gson.Gson;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultaMoneda {
    public Moneda Consulta(String Nombremoneda) throws IOException, InterruptedException {
        Moneda moneda = null;
        try{
            HttpClient client = HttpClient.newHttpClient(); //Creación del cliente HTTP y Envío
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/6f6acf81ae254a875af41820/latest/"+Nombremoneda))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            moneda = new Gson().fromJson(response.body(),Moneda.class);

            return  moneda;
        }catch(ConnectException e){
            System.out.println("No existe la conexion en este momento :c");
        }
        return moneda;
    }
}
