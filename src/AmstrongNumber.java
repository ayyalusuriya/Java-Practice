public class AmstrongNumber {

    static int count(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;

    }

    static int power(int num, int count) {
        int temp = 1;
        for (int i = 1; i <= count; i++) {
            temp *= num;
        }
        return temp;
    }

    static void check(int num) {
        int OG = num;
        int Count = count(num);
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += power(rem, Count);
            num /= 10;
        }
        System.out.println(OG == sum ? "Amstrong" : "Mot an Anstrong");
    }


    public static void main(String[] args) {
        check(153);

    }
}
