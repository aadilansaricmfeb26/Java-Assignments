/*
Bonus Problem: Menu-Driven Java Program
(Switch-Case)
Problem Statement:
You are required to write a menu-driven Java program that implements four separate
problems. The program should allow the user to select which problem to run, execute the
corresponding logic, and then return to the menu until the user chooses to exit.
The four problems are as follows (Already done in assignment 2, just put it in switch
case):
Problem 1: Grade Evaluation System
Problem 2: Leap Year Check
Problem 3: Day of the week
Problem 4: Identify Default Values of Variables
Case 5: Exit
 */

import java.util.Scanner;

public class MenuDrivenProgram {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;

        while (true) {
            System.out.println("Welcome to Java menu driven program");
            System.out.println("Enter 1 For Grade Evaluation System");
            System.out.println("Enter 2 For Leap Year Check");
            System.out.println("Enter 3 For Day of the week");
            System.out.println("Enter 4 For Identify Default Values of Variables");
            System.out.println("Enter 5 For Exit");

            System.out.print("Please Enter Your Choice: ");
            userChoice = sc.nextInt();

            if (userChoice == 5) {
                System.out.println("Exiting... Thanks for using my program");
                break;
            }

            switch (userChoice) {
                case 1:
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

                    sum = (english + hindi + math + science + history) / 5.0f;

                    if (sum >= 90) {
                        System.out.println("Congratulation! Your Grade is A");
                    } else if (sum >= 70 && sum <= 89) {
                        System.out.println("Congratulation! Your Grade is B");
                    } else if (sum >= 50 && sum <= 69) {
                        System.out.println("Congratulation! Your Grade is C");
                    } else if (sum >= 30 && sum <= 49) {
                        System.out.println("Congratulation! Your Grade is D");
                    } else {
                        System.out.println("You are fail! Your Grade is F :(");
                    }
                    break;
                case 2:
                    System.out.println("Enter Year: ");
                    int year = sc.nextInt();

                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }

                    break;
                case 3:

                    System.out.println("Enter an integer between 1 and 7 ");

                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("The day is Monday");
                            break;

                        case 2:
                            System.out.println("The day is Tuesday");
                            break;
                        case 3:
                            System.out.println("The day is Wednesday");
                            break;
                        case 4:
                            System.out.println("The day is Thursday");
                            break;
                        case 5:
                            System.out.println("The day is Friday");
                            break;
                        case 6:
                            System.out.println("The day is Saturday");
                            break;
                        case 7:
                            System.out.println("The day is Sunday");
                            break;

                        default:
                            System.out.println("Error: Invalid day number. Please enter a value between 1-7");
                    }
                    break;
                case 4:
                    byte a = 10;
                    short b = 100;
                    int c = 1000;
                    long d = 10000L;
                    float e = 10000.0f;
                    double f = 1000000;
                    char g = 'A';
                    boolean h = true;

                    // System.out.println(a); //Compilation error before: variable a might not have been initialized

                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(d);
                    System.out.println(e);
                    System.out.println(f);
                    System.out.println(g);
                    System.out.println(h);
                    break;
                default:
                    System.out.println("Please Enter a valid choice");
                    break;
            }
        }

    }

}
