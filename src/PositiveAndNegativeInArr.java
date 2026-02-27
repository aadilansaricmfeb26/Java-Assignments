import java.util.Scanner;

public class PositiveAndNegativeInArr {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter " + (i +1) + " element of the array (max 6 element): ");
            int userNum = sc.nextInt();
            arr[i] = userNum;
        }

        int posCount = 0;
        int negCount = 0;

        for(float element : arr){
            if (element>0){
                posCount++;
            } else if(element<0) {
                negCount++;
            }
        }

        System.out.println("Positive numbers: " + posCount);
        System.out.println("Negative numbers: " + negCount);

    }
}
