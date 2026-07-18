public class Sumdigits {
    static void sum(int num){
        int sum = 0;

        while(num!=0){
            int last = num%10;
            sum+=last;
            num/=10;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        sum(1234);

    }
}
