import java.io.*;
public class OtherAccept {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value");
        int value = Integer.parseInt(br.readLine());
        System.out.print("Enter a character");
        char ch = (char)br.read();
        System.out.print("Enter a Name");
        String Name = br.readLine();
        System.out.println("You entered=" + value);
        System.out.println("You entered=" + ch);
        System.out.println("You entered=" + Name);
    }
}