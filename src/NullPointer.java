import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
      String s = null;
        try {
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println("Null Values Not accepted...!" + e);
        }
    }
}
