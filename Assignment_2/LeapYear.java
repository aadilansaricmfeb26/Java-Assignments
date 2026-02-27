/*
Problem 2: Leap Year
Problem Statement:
Write a Java program that checks whether the year is a leap year or not. A year is a leap year if:
It is divisible by 4, but not divisible by 100, or
It is divisible by 400.
Predefined Value (Try with different values as well):
● Year = 2024
● Year = 1900
Expected Output:
2024 is a leap year.
1900 is not a leap year.
*/

import java.util.Scanner;

public class LeapYear {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
