public class MultiException {
    public static void main(String[] args) {
        try {
            //Arithemetic Exception
//            int a = 10;
//            int b = 0;
//            System.out.println(a / b);

            //ArrayIndexOutOfBound
//            int arr[] = {10 , 20 , 30};
//            System.out.println(arr[5]);

            String s = "ABC";
            int num = Integer.parseInt(s);

        }catch (ArithmeticException e){
            System.out.println("Arithemetic Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index..!");
        }
        catch (NumberFormatException e){
            System.out.println("NumberException: " + e);
        }
        System.out.println("Program Continues Normal...!");
    }
}
