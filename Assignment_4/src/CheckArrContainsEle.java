import java.util.Arrays;
import java.util.Scanner;

public class CheckArrContainsEle {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i +1) + " element of the array: ");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int element : arr) {
            if(num == element){
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(num + " is found in the array");
        } else {
            System.out.println(num + " is not found in the array");
        }

    }
}
