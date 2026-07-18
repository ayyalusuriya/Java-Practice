import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1 ; i<=10;i++){
            arr.add(i);


        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
