public class NeonNumber {

    int Check(int SQ) {

        int sum = 0;
        while (SQ != 0) {

            int last = SQ % 10;
            sum += last;
            SQ/= 10;
        }
        return sum;


    }

    void res(int num){
        int temp = num;
        int SQ = num * num;
        int result = Check(SQ);
        if(result == temp){
            System.out.println("Neon Number: " + result);
        }else {
            System.out.println("Not a Neon number..!");
        }
    }
    public static void main(String[] args) {

        NeonNumber n = new NeonNumber();

        n.res(9);

    }
}
