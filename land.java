import java.io.*;
class land
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("fdgfdgdf");
        System.out.print("enyter the no");        
        int a=Integer.parseInt(buff.readLine());
        System.out.println(a);
        int b[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                b[i][j]=i*j;
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}