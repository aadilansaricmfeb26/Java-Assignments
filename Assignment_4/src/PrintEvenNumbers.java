import java.util.Scanner;

public class PrintEvenNumbers {

    static void printEvenNumber() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive interger:");
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 1; i <=num/2; i++) {
            System.out.println(counter+=2);
        }
    }
    static void main(String[] args) {
        PrintEvenNumbers.printEvenNumber();
    }
}
