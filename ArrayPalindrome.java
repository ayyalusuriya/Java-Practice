import java.util.Arrays;

public class ArrayPalindrome {


    public static void main(String[] args) {
        int[] ar = {1 , 2 , 3};
        int[] newAr = new int[ar.length];
        int index = 0;
        for(int i = ar.length - 1; i>=0;i--){
            newAr[index++] = ar[i];
        }

        System.out.println(Arrays.toString(newAr));

        for (int i = 0 ;i < newAr.length;i++){
            if(!(ar[i] == newAr[i])){
                System.out.println("Not a palindrome");
                return;
            }


        }
        System.out.println("palindrome");

    }


}
