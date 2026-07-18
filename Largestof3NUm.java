public class Largestof3NUm {

    static void largest(int num1 , int num2, int num3){
            if(num1>= num2 && num1>= num3){
                System.out.println("lagest: " + num1);

            }else if(num2> num3 || num2 >= num1){
                System.out.println(num2);

            }else {
                System.out.println(num3);
            }
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 25;
        int num3 = 13;

        largest(num1, num2,num3);
    }
}
