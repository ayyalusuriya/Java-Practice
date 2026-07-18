import java.net.URLEncoder;
import java.util.Scanner;

public class NullPointers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type 'null' to simulate null: ");
        String s = sc.nextLine();

        if (s.equals("null")) {
            s = null;
        }

        try {
            System.out.println("Length = " + s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null values are not accepted.");
        }

        sc.close();
    }
}
