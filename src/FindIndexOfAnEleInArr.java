import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfAnEleInArr {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i +1) + " element of the array: ");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        Arrays.sort(arr);

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        int index = Arrays.binarySearch(arr, num);

//        System.out.println(index);

        if (index >= 0) {
            System.out.println("The number "+num + " is found at index "+index);
        } else {
            System.out.println("The number "+num + " is not found anywhere in the array");
        }

    }
}
