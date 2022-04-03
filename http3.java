import java.net.*;
import java.net.http.*;
public class http3 
{
    public static void main(String args[])
    {
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()) 
            //.timeout(Duration.ofMinutes(2))
            //.header("Content-Type", "application/json")
            //.POST(BodyPublishers.ofFile(Paths.get("file.json")))
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println)
            .join();
    }
}
