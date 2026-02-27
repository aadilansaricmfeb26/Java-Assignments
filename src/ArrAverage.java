import java.util.Scanner;

public class ArrAverage {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i +1) + " element of the array");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        float avg = 0.0f;

        for(float element : arr){
            avg += element;
        }
        avg = avg/arr.length;
        System.out.println("The average of the numbers is: " + avg);

    }
}
