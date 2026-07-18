public class Dimond {

    public static void main(String[] args) {
        int n = 4;
//        int index = 0;
        for(int i = 1;i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int L = n - 1;L >= 1;L--) {
            for (int j = 1; j <= n - L; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<= 2 * L - 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
