import java.util.Scanner;

public class AC_3_Lecture_Homework_1 {
    public static void main(String[] args) {
        /*
         * Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
         * follows :
         * 1 : + (Addition) a + b
         * 2 : - (Subtraction) a - b
         * 3 : * (Multiplication) a * b
         * 4 : / (Division) a / b
         * 5 : % (Modulo or remainder) a % b
         * Calculate the result according to the operation given and display it to the
         * user.
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("OPERATORS:");
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");
        System.out.print("Enter an operator: ");
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                System.out.println("Result: " + (a / b));
                break;
            case 5:
                System.out.println("Result: " + (a % b));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        sc.close();
    }
}
