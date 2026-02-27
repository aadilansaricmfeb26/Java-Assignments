import java.util.Scanner;

class Fact {

    void calculateFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNum = sc.nextInt();
        int result = calFact(userNum);
        System.out.println("Factorial of " + userNum + " is " + result);
    }

    int calFact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calFact(num - 1);
        }
    }
}

public class Factorial {

    static void main(String[] args) {
        Fact factObj = new Fact();

        factObj.calculateFactorial();
    }


}
