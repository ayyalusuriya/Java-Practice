import javax.lang.model.element.Element;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
public class indexOutOfBound {
    public static void main(String[] args) {
        int[] arr= {12  , 23 , 32};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        try{
            System.out.println("Element: " + arr[index]);
        }catch (Exception e){
            System.out.println("invalid array index...!");
        }
    }
}
