import java.io.*;
public class DoubleAccept
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter double float value: ");
        double value = Double.parseDouble(br.readLine());
        System.out.print("You entered = " + value);
    }
}
