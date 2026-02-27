import java.util.Scanner;

public class StringLiteralAndObjectCreation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        boolean flag = (str1 == str2);

        System.out.println("Both variables point to the same object: " + flag);
    }
}
