import java.io.*;
class io
{
        public static void main(String args[])
        {
                BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
                try
                {
                        BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
                        for(int i=1;i<=10;i++)
                        {
                                String a=buff.readLine();
                                writer.write("\n"+a);
                        }
                        writer.close();
                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
                try
                {
                        BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
                        String s;
                        while((s=reader.readLine()) !=null)
                        {
                                System.out.println(s);
                        }
                        reader.close();
                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
        }
}
	
	
	

