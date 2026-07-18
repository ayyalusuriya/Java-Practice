import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input: ");
        String Input = sc.nextLine();

        try{
            int number = Integer.parseInt(Input);
            System.out.println("Number: " + number);
        }catch (Exception e){
            System.out.println("Invalid Number..!" + e);
        }
    }
}
