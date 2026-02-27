import java.util.Scanner;

public class LargestEleInArr {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter " + (i +1) + " element of the array: ");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        for(int i = 0; i <arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The largest element is: " + max);

    }

}
