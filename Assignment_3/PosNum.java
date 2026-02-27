/*
Problem 4: User Input for Positive Numbers (Using do-while Loop)
Problem Statement:
Write a Java program that repeatedly asks the user to enter a positive number.
1. Create a method askForPositiveNumber() that uses a do-while loop to ask the user for a number
until they enter a positive number.
2. Use the Scanner class to take the user’s input.
3. Once a positive number is entered, the program should display the number.
Sample Input:
Enter a positive number: -5
Enter a positive number: 0
Enter a positive number: 8
Expected Output:
You entered a positive number: 8
C-
 */

import java.util.Scanner;

public class PosNum {

    static void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive number");
            }
        } while (num <= 0);
        System.out.println("You entered a positive number: " + num);
    }

    static void main(String[] args) {

        PosNum.askForPositiveNumber();
    }
}
