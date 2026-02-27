import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Enter a number");

        number = sc.nextInt();

        if(number > 0) {
            System.out.println(number + " Is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither positive or negative");
        }
    }
}
