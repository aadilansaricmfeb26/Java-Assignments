/*
Problem 1: Grade Evaluation System
Problem Statement:
Write a Java program that calculates the average marks of a student and determines the grade based on the
following criteria:
Grade A: Average marks ≥ 90
Grade B: Average marks between 70 and 89
Grade C: Average marks between 50 and 69
Grade D: Average marks between 30 and 49
Fail: Average marks < 30
Predefined Values (Try with different values as well):
● Marks in Maths = 80
● Marks in Science = 85
● Marks in History = 90
Expected Output:
Average Marks: 85
Grade: B
 */

import java.util.Scanner;

public class GradeEvaSys {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float english;
        float hindi;
        float math;
        float science;
        float history;
        float sum = 0.0f;

        System.out.println("Enter your English marks: ");
        english = sc.nextFloat();

        System.out.println("Enter your Hindi marks: ");
        hindi = sc.nextFloat();

        System.out.println("Enter your Math marks: ");
        math = sc.nextFloat();

        System.out.println("Enter your Science marks: ");
        science = sc.nextFloat();

        System.out.println("Enter your History marks: ");
        history = sc.nextFloat();

        sum = (english+hindi+math+science+history)/5.0f;

//        System.out.println(sum);

        if(sum>=90) {
            System.out.println("Congratulation! Your Grade is A");
        } else if (sum>=70 && sum <= 89) {
            System.out.println("Congratulation! Your Grade is B");
        } else if (sum>=50 && sum <= 69) {
            System.out.println("Congratulation! Your Grade is C");
        } else if (sum >=30 && sum <= 49) {
            System.out.println("Congratulation! Your Grade is D");
        } else {
            System.out.println("You are fail! Your Grade is F :(");
        }

    }
}