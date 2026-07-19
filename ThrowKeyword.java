import java.util.Scanner;


public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age here: ");
        int age = sc.nextInt();

        try {
            if(age < 18){
                throw new ArithmeticException("Not eligible to vote");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
