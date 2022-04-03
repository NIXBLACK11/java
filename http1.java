import java.net.*;
import java.io.*;
public class http1
{
        private static HttpURLConnection connection;
        public static void main(String args[])
        {
                BufferedReader reader;
                String line;
                StringBuffer responseContent = new StringBuffer();
                try
                {
                        URL url =new URL( "https://jsonplaceholder.typicode.com/albums");
                        connection =(HttpURLConnection) url.openConnection();
                        connection.setRequestMethod("GET");
                        connection.setConnectTimeout(5000);
                        connection.setReadTimeout(5000);
                        int status = connection.getResponseCode();
                        System.out.println(status);
                        if(status>299)
                        {
                                reader=new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                                while((line=reader.readLine()) != null)
                                {
                                        responseContent.append(line);
                                }
                                reader.close();
                        }
                        else
                        {
                                reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                                while((line=reader.readLine())!=null)
                                {
                                        responseContent.append(line);
                                }
                                reader.close();
                        }
                        System.out.println(responseContent.toString());

                }
                catch(MalformedURLException e)
                {
                        e.printStackTrace();
                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
                finally
                {
                        connection.disconnect();
                }
        }
}