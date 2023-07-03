public class Break {
    public static void main(String args[]) {
        char color = 'g';
        switch (color) {
            case 'w' : System.out.println("white");
            break;
            case 'b' : System.out.println("black");
            break;
            case 'g' : System.out.println("green");
            break;
            case 'o' : System.out.println("orange");
            break;
            default  : System.out.println("No color");
        }
    }
}
