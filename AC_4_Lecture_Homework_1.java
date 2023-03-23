/*
 * Print all even numbers till n.
 */

import java.util.Scanner;

public class AC_4_Lecture_Homework_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}