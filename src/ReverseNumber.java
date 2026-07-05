public class ReverseNumber {

    static void reverse(int num){
        int res = 0;
        while(num != 0){

            int last = num%10;
            res = (res * 10) + last;

            num/=10;
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        int num = 1234;

        reverse(num);

    }
}
