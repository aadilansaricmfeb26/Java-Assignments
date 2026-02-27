import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, breadth;

        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextFloat();

        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextFloat();

        float area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }
}
