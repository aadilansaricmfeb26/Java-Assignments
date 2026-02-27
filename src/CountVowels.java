import java.util.Scanner;

public class CountVowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String lowerCaseStr = str.toLowerCase();

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char ch = lowerCaseStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }

        System.out.println("The number of vowels in " + str + " is: " + counter);

    }
}
