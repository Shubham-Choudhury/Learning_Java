import java.util.Scanner;

public class AC_4_Lecture_Homework_2 {
    public static void main(String[] args) {
        /*
         * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
         * If the user enters 1 then keep taking input from the user for a student’s
         * marks(out of 100).
         * If they enter 0 then stop.
         * If he/ she scores :
         * Marks >=90 -> print “This is Good”
         * 89 >= Marks >= 60 -> print “This is also Good”
         * 59 >= Marks >= 0 -> print “This is Good as well”
         * Because marks don’t matter but our effort does.
         * (Hint : use do-while loop but think & understand why)
         * 
         */

        Scanner scanner = new Scanner(System.in);
        int choice, marks;

        do {
            System.out.print("Enter 1 to enter student's marks or 0 to exit: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (89 >= marks && marks >= 60) {
                    System.out.println("This is also Good");
                } else if (59 >= marks && marks >= 0) {
                    System.out.println("This is Good as well");
                }
            }
        } while (choice != 0);

        scanner.close();
    }
}
