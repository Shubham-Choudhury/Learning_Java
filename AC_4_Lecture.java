import java.util.Scanner;

public class AC_4_Lecture {
    public static void main(String[] args) {
        // ==================== LOOPS ==================== \\
        // Loops are used to repeat a block of code.
        // There are 3 types of loops in Java:
        // 1. for loop
        // 2. while loop
        // 3. do-while loop

        /*
         * ==================== FOR LOOP ====================
         * for (initialization; condition; increment/decrement) {
         * // code
         * }
         * The initialization is executed only once, when the loop starts.
         * The condition is evaluated at the beginning of each loop iteration.
         * The code block will be executed as long as the condition is true.
         * The increment/decrement is executed at the end of each loop iteration.
         * The increment/decrement is optional.
         */
        System.out.println("=================== FOR LOOP =================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
        System.out.println("====================================");
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World - " + i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("====================================");
        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Hello World - " + i);
        }

        /*
         * ==================== WHILE LOOP ====================
         * while (condition) {
         * // code
         * }
         * The condition is evaluated at the beginning of each loop iteration.
         * The code block will be executed as long as the condition is true.
         */
        System.out.println("=================== WHILE LOOP =================");
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World");
            i++;
        }
        System.out.println("====================================");
        i = 1;
        while (i < 6) {
            System.out.println("Hello World - " + i);
            if (i == 3) {
                break;
            }
            i++;
        }
        System.out.println("====================================");
        i = 1;
        while (i < 6) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("Hello World - " + i);
            i++;
        }

        /*
         * ==================== DO-WHILE LOOP ====================
         * do {
         * // code
         * } while (condition);
         * The code block will be executed at least once, even if the condition is
         * false.
         * The condition is evaluated at the end of each loop iteration.
         */
        System.out.println("=================== DO-WHILE LOOP =================");
        i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i < 3);
        System.out.println("====================================");
        i = 1;
        do {
            System.out.println("Hello World - " + i);
            if (i == 3) {
                break;
            }
            i++;
        } while (i < 6);
        System.out.println("====================================");
        i = 1;
        do {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("Hello World - " + i);
            i++;
        } while (i < 6);
        System.out.println("====================================");
        i = 1;
        do {
            System.out.println("Hello Duniya");
            i++;
        } while (i == 0);
        System.out.println("====================================\n");


        /*
         * Print the sum of First n Natural Numbers.
         */
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        System.out.println("Sum of First " + n + " Natural Numbers: " + sum);
        System.out.println("====================================\n");

        /*
         * Print the table of a number input by user.
         */
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + (n * j));
        }
        System.out.println("====================================\n");

        sc.close();

    }
}
