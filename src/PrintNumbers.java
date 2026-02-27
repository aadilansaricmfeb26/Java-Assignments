import java.util.Scanner;

public class PrintNumbers {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many number you want to print: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
