import java.util.Scanner;

public class GoodMorningMessage {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int time;
        System.out.println("Enter the time (12 Hour Format): ");

        time = sc.nextInt();

        if(time >= 5 && time < 12) {
            System.out.println("Good Morning!");
        }
    }
}
