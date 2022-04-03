import java.net.*;
import java.net.http.HttpRequest;
import java.net.http.*;
public class http2
{
    public static void main(String args[])
    {
        try
        {
            HttpClient client=HttpClient.newHttpClient();
            HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).POST(HttpRequest.BodyPublishers.noBody()).build();//for GET remove .POST(HttpRequest.BodyPublishers.noBody())
            HttpResponse response=client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(response.headers());
            System.out.println(response.request());
            System.out.println(response.statusCode());   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }    
    }
}