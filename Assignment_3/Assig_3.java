/*
Problem 2: Simple Age Checker (Using a Method)
Problem Statement:
Write a Java program that includes a method to check the age category.
1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints
whether the user is a minor, adult, or senior citizen.
2. In the main method, use the Scanner class to prompt the user to enter their age.
3. Pass the user's age to the checkAgeCategory() method.
Sample Input:
Enter your age: 30
Expected Output:
You are an adult.
 */
import java.util.Scanner;

class Problems{

    void checkAgeCategory(int age){
        if (age <= 0) {
            System.out.println("You are not even born yet!");
        }
        else if (age <= 17) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 59) {
            System.out.println("You are an adult");
        } else if (age >= 60 && age <= 130) {
            System.out.println("You are a senior citizen");
        } else {
            System.out.println("You are a ghost!");
        }
    }
}

public class Assig_3 {

    static void main(String[] args) {
        Problems problemsObj = new Problems();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int userAge = sc.nextInt();

        problemsObj.checkAgeCategory(userAge);
    }

}
