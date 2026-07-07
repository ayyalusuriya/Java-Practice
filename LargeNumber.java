import java.util.Scanner;

public class LargeNumber {
    static int largest(int a , int b , int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the a: ");
            int a = sc.nextInt();
            System.out.println("Enter the b: ");
            int b = sc.nextInt();
            System.out.println("Enter the c: ");
            int c = sc.nextInt();

            int res = largest(a , b, c);

        System.out.println(res);
    }
}
