import java.util.Scanner;

public class NestedException {
    public static void main(String[] args) {
    try{
        System.out.println("Outer try block..!");
        try {
            System.out.println("Inner Query..!");
            int res = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Arithemetic Exception.." + e);
        }

        int arr[] = {10 , 202 , 30};
        System.out.println(arr[8]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException..." + e);
    }
    }
}
