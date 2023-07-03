import java.io.*;
public class StringAccept {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String");
        String Name = br.readLine();
        System.out.print("You Entered=" + Name);
    }
}


