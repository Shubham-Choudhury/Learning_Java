import java.util.Scanner;

public class AC_4_Lecture_Homework_3 {
    public static void main(String[] args) {
        /*
         * Print if a number is prime or not (Input n from the user).
         * [In this problem you will learn how to check if a number is prime or not]
         * 
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        scanner.close();
    }
}
