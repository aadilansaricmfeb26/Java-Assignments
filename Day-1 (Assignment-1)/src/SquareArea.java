import java.util.Scanner;

public class SquareArea {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float side;
    System.out.println("Enter a side of the square");
    side = sc.nextFloat();
    float area = side * side;
    System.out.println("Area of a sqare is: " + area);
}
}
