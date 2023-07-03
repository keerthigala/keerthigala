import java.io.*;
public class FloatAccept
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Float value");
        float value = Float.parseFloat(br.readLine());
        System.out.print("you entered:" + value);
    }
}
