import java.util.Scanner;

public class PrintStrArr {

    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter " + (i+1) + " name: ");
            String userNum = sc.nextLine();
            arr[i] = userNum;
        }

        for (String element : arr) {
            System.out.println(element);
        }


    }
}
