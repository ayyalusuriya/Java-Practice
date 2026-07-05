public class MissingNumber {


    public static void main(String[] args) {
int sum = 0;
        int max = 0;
        int ar[] = {1 , 2 , 3 ,5};


        for(int i =0;i < ar.length;i++){
            if(ar[i] > max){
                max = ar[i];
            }
            sum+=ar[i];
        }

        int num = max;
        int sum1 = num*(num+1)/2;
        int res = sum1 - sum;


        System.out.println(res);

        


    }
}
