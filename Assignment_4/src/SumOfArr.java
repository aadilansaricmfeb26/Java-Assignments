import java.util.Scanner;

public class SumOfArr {

    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i+1) + " element of the array");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }
        for (int element : arr) {
            sum += element;
        }

        System.out.println("The sum of all numbers is: " + sum);
    }
}
