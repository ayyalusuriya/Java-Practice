import java.util.ArrayList;

public class RemoveEvenNUmber {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1 ; i<=40;i++){
            arr.add(i);
        }
        for (int i = 0;i <= arr.size() - 1;i++){

            if(arr.get(i)%2 == 0){
                arr.remove(arr.get(i));
            }

            System.out.println(arr.get(i));
        }
        }
}
