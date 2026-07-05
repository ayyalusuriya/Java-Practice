import java.util.Scanner;

public class Rectangle {
    int res = 0;
    int area(int length , int breadth){
        res = length * breadth;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Length: ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth; ");
        int breadth = sc.nextInt();
        Rectangle r = new Rectangle();

        int area0fRect = r.area(length , breadth);
        System.out.println("Area of the Given Length is: " + area0fRect);

    }
}
