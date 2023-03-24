import java.util.Scanner;

public class AC_8_Lecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("============ Average of Three Number ============");
        // System.out.println("Enter 3 numbers: ");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // int num3 = input.nextInt();
        // average(num1, num2, num3);

        // System.out.println("============ Sum of Odd Numbers ============");
        // System.out.println("Enter a number: ");
        // int num = input.nextInt();
        // sumOfOdd(num);

        // System.out.println("============ Greater of Two Numbers ============");
        // System.out.println("Enter 2 numbers: ");
        // int num4 = input.nextInt();
        // int num5 = input.nextInt();
        // greater(num4, num5);

        // System.out.println("============ Circumference of a Circle ============");
        // System.out.println("Enter the radius of a circle: ");
        // double radius = input.nextDouble();
        // circumference(radius);

        // System.out.println("============ Eligibility to Vote ============");
        // System.out.println("Enter your age: ");
        // int age = input.nextInt();
        // vote(age);

        // System.out.println("============ Count of Positive, Negative and Zero
        // ============");
        // count();

        // System.out.println("============ Power of a Number ============");
        // System.out.println("Enter 2 numbers: ");
        // int x = input.nextInt();
        // int n = input.nextInt();
        // power(x, n);

        // System.out.println("============ GCD of Two Numbers ============");
        // System.out.println("Enter 2 numbers: ");
        // int num6 = input.nextInt();
        // int num7 = input.nextInt();
        // gcd(num6, num7);

        System.out.println("============ Fibonacci Series ============");
        System.out.println("Enter the number of terms: ");
        int n = input.nextInt();
        fibonacci(n);

        input.close();
    }

    // Enter 3 numbers from the user & make a function to print their average.
    public static void average(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);
        System.out.println();
    }

    // function to print the sum of all odd numbers from 1 to n
    public static void sumOfOdd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all odd numbers from 1 to " + num + " is: " + sum);
        System.out.println();
    }

    // function which takes in 2 numbers and returns the greater of those two.
    public static void greater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }

    // function that takes in the radius as input and returns the circumference of a
    // circle
    public static void circumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of a circle with radius %.2f is %.2f\n", radius, circumference);
    }

    // function that takes in age as input and returns if that person is eligible to
    // vote or not. A person of age > 18 is eligible to vote.
    public static void vote(int age) {
        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    // program to enter the numbers till the user wants and at the end it should
    // display the count of positive, negative and zeros entered
    public static void count() {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;
        do {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Do you want to continue? (y/n)");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        input.close();
    }

    // Two numbers are entered by the user, x and n. function to find the value of
    // one number raised to the power of another i.e. x^n
    public static void power(int x, int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("The value of " + x + " raised to the power of " + n + " is: " + result);
    }

    // function that calculates the Greatest Common Divisor of 2 numbers.
    public static void gcd(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // program to print Fibonacci series of n terms where n is input by user :
    // 0 1 1 2 3 5 8 13 21 .....
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that
    // came before it.
    public static void fibonacci(int n) {
        long num1 = 0;
        long num2 = 1;
        long sum = 0;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }

}
