public class AddPrime {

    static boolean checkPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int ar[] = {2, 6, 5, 7};

        int start = 20;
        int end = 30;

        int index = 0;

        for (int i = start; i < end; i++) {

            int sum = i + ar[index];

            if (checkPrime(sum)) {
                System.out.println(sum);
            }

            index++;

            if (index == ar.length) {
                index = 0;
            }
        }
    }
}