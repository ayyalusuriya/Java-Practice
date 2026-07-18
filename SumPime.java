public class SumPime {

    boolean Prime(int Start , int end){
        int sum = 0;
        for(int num = Start; num <= end;num++){
            if(num < 2){
                return false;
            }
            for(int i = 2; i <=num;i++){
                boolean isPrime = true;
                if(num%i==0){
                    isPrime = false;
                    break;
                }
                sum += num;
            }
        }
        System.out.println(sum);
        return false;
    }
    public static void main(String[] args) {

        SumPime s = new SumPime();
        s.Prime(20 , 40);

    }
}
