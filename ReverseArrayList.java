import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }

        int left = 0;
        int right = arr.size() - 1;

        while (left <right){
            int temp = arr.get(left);
            arr.set(left , arr.get(right));
            arr.set(right,temp);

            left++;
            right--;
        }
        System.out.println(arr);
    }

}
