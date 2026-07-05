import java.util.Scanner;

public class Palindrome_Number {
    static int palindrome(int num){
        int result = 0;

        while(num!=0){
            result = (result *10) + (num%10);
            num/=10;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Here: ");
        int num = sc.nextInt();

        int temp = num;
        int res = palindrome(num);
        System.out.println(temp == res ? "palindrome" : "Not a palindrome");
    }
}
