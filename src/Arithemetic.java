import java.util.Scanner;

public class Arithemetic {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter teh Second number: ");
        int b = sc.nextInt();
        try{
            int sum = a/b;
            System.out.println(sum);

        }
        catch (Exception e){
            System.out.println("cannot divide by zero..!");
        }
        sc.close();
    }
}
