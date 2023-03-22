import java.util.Scanner;

public class AC_3_Lecture {
    public static void main(String[] args) {
        // ==================== CONDITIONAL STATEMENTS ==================== \\
        /*
         * Conditional Statements:
         * - if
         * - if-else
         * - if-else-if
         * - switch
         * 
         * if:
         * - if (condition) {
         * // code
         * }
         * 
         * if-else:
         * - if (condition) {
         * // code
         * } else {
         * // code
         * }
         * 
         * if-else-if:
         * - if (condition) {
         * // code
         * } else if (condition) {
         * // code
         * } else {
         * // code
         * }
         * 
         * switch:
         * - switch (variable) {
         * case value1:
         * // code
         * break;
         * case value2:
         * // code
         * break;
         * default:
         * // code
         * break;
         * }
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

        System.out.println("Buttons:: \n\t-1\n\t-2\n\t-3");
        System.out.print("Enter a button: ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("You pressed button 1");
                break;
            case 2:
                System.out.println("You pressed button 2");
                break;
            case 3:
                System.out.println("You pressed button 3");
                break;
            default:
                System.out.println("Invalid button");
                break;
        }

        sc.close();
    }
}
