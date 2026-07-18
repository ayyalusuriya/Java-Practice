public class Patterns {
    public static void main(String[] args) {
        int n = 6;
        int index = 1;
        for(int i = 1; i <= n ;i++ ) {
            for(int j = 1;j <= i;j++){
                System.out.print(index++ + " ");
            }
            System.out.println();
        }
    }
}
