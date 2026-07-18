import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Ayya12@2329";
        char[] ar = s.toCharArray();
        int start = 0;
        int end = ar.length -1;
     while(start < end){
         if(!Character.isLetterOrDigit(ar[start])){
             start++;
         }else if(!Character.isLetterOrDigit(ar[end])){
             end--;
         } else {
             char temp = ar[start];
             ar[start] = ar[end];
             ar[end] = temp;
             start++;
             end--;
         }

        }
        System.out.println(Arrays.toString(ar));
    }
}
