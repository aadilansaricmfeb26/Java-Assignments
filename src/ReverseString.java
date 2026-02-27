import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String revStr = "";

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            revStr = str.charAt(i) + revStr;
        }

        System.out.println(revStr);

    }
}
