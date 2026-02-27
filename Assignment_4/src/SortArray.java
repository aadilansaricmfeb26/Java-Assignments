import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i +1) + " element of the array: ");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        Arrays.sort(arr);

        System.out.print("Sorted Array: ");
        for(int element : arr) {
            System.out.print(element + " ");
        }

    }
}
