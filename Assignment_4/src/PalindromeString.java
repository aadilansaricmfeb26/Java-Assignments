import java.util.Scanner;

public class PalindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String revStr = "";

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String lowerCaseStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < lowerCaseStr.length(); i++) {
//            System.out.println(str.charAt(i));
            revStr = lowerCaseStr.charAt(i) + revStr;
        }
        if (revStr.equals(lowerCaseStr)) {
            System.out.println("The string "+str+ " is a palindrome");
        } else {
            System.out.println("The string "+str+ " is not a palindrome");
        }

    }
}
