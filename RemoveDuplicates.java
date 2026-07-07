import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(20);
            arr.add(20);
            arr.add(50);
            arr.add(23);
            ArrayList<Integer> res = new ArrayList<>();
        for(Integer i : arr){
                if(!res.contains(i)){
                    res.add(i);
                }
        }
        System.out.println(res);
        }
    }

