public class Duplicate {

    public static void main(String[] args) {
        int ar[] = {1 , 2, 3, 2, 4 , 4};

        for(int i = 0 ; i  <ar.length;i++){
            for (int j = i+1 ;j < ar.length;j++){
                if(ar[i] == ar[j]){
                    System.out.println("Duplicate: " + ar[i]);
                }
            }

        }

    }
}
