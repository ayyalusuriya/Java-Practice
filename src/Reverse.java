public class Reverse {
   static int rev(int num){
        int rev = 0;
        while (num!=0){
            int last = num%10;
            rev =(rev*10) + last;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
       int res =  rev(1234);
        System.out.println(res);

    }
}
