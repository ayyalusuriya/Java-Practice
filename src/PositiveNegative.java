public class PositiveNegative {

    public static void posinegative(int num){

        if(num >= 1){
            System.out.println("Positive");
        }
        else if(num <= -1) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

    }
    public static void main(String[] args) {
            posinegative(0);
    }
}
