public class SumOfPrime {

    boolean Prime(int start, int end) {
        for (int num = start; num <= end; num++) {

            if (num <= 1) {
                return false;
            }
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SumOfPrime s = new SumOfPrime();
        s.Prime(2 , 20);
    }
}