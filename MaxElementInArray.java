import java.util.ArrayList;

public class MaxElementInArray {


        public static void main(String[] args) {
            int sum = 0;

            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =1 ; i<=10;i++){
                arr.add(i);
            }
            int max = arr.get(0);
            for(int i = 0; i <= arr.size() -1;i++ ){
                if(arr.get(i) > max){
                   max = arr.get(i);
                }

            }
            System.out.println(max);
    }
}
