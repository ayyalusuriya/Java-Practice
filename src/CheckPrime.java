public class CheckPrime {

    static void Prime(int num) {
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            boolean prime = true;

                if (last < 2) {
                    prime = false;
                } else {
                    for (int i = 2; i <= last/2; i++) {
                        if (last % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }

            if (prime) {
                sum += last;
            }

            num/=10;

        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        Prime(23562);
    }
}
