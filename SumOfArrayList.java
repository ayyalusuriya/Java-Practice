import java.util.ArrayList;

public class SumOfArrayList {
    public static void main(String[] args) {
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1 ; i<=10;i++){
            arr.add(i);
        }
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }

}
