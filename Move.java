import java.util.Arrays;

public class Move {

    public static void main(String[] args) {

        int ar[] = {1 , 2, 3, 4, 5};

        int k = 2;

        int temp1 = ar[0];
        int temp2 = ar[1];

        for(int i = k;i<ar.length;i++){
            ar[i - k] = ar[i];
        }
        ar[ar.length-2] = temp2;
        ar[ar.length -1] = temp1;
        System.out.println(Arrays.toString(ar));
    }

}

