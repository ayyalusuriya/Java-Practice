public class ThrowsKeyword {

    static void res(int a , int b)throws ArithmeticException{
        int result = a/b;
        System.out.println("result: " + result);
    }
    public static void main(String[] args) {
        try{
            res(10 , 0);
        }catch (Exception e){
            System.out.println("Arithemetic Exception: " + e);
        }
    }
}
