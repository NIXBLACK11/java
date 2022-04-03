import java.io.*;
public class test 
{
    public static void main (String args[])throws IOException
    {
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String s=buff.readLine();
        s=s+"       ";
        String js[]=new String[100];
        char c=0;
        try
        {
            for(int i=0;i<s.length();i++)
            {
                String s1=" "+s.charAt(i)+s.charAt(i+1)+s.charAt(i+2)+s.charAt(i+3);
                if(s1.equals(" http"))
                {
                    for(int j=i+6;j<s.length();j++)
                    {
                        String s2=" "+s.charAt(j)+s.charAt(j+1)+s.charAt(j+2);
                        if(s2.equals(" .js"))
                        {
                            js[c]=s.substring(i,j+3);
                            c++;
                            break;
                        }
                    }
                    continue;
                }
            }
        }
        catch(Exception e)
        {}
        for(int o=0;o<c;o++)
        {
            System.out.println(js[o]);
        }
    }
}