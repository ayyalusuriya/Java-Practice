public class SumOfDigit {

    static void SumofDigit(int num){
        int sum = 0;
        while (num!=0){
            int last = num%10;
            sum+=last;
            num/=10;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 1234;
        SumofDigit(456);
    }
}
