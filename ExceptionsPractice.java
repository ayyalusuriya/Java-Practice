import java.util.Scanner;
public class ExceptionsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        try {
            int div = a/b;
            System.out.println("Result: " + div);
        }
        catch (ArithmeticException e){
            System.out.println("Arithemetic Exception: "+ e);
        }finally {
            System.out.println("Program Ended");
        }
        sc.close();
    }
}
