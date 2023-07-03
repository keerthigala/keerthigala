import java.io.*;
public class IntegerAccept
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value ");
        int num = Integer.parseInt(br.readLine());
        System.out.print("You Entered=" + num);
    }

}
