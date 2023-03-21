
import java.util.*;

public class AC_2_Lecture {
    public static void main(String[] args) {

        // ==================== OUTPUT ==================== \\
        System.out.println("Hello World with println()");
        System.out.print("Hello World with print() 2\n");
        System.out.printf("Hello World with printf() %d\n", 3);
        /*
         * println():
         * - prints a string and a new line
         * - can be used to print any type of data
         * - can be used to print multiple strings
         * 
         * print():
         * - prints a string
         * - can be used to print any type of data
         * - can be used to print multiple strings
         * 
         * printf():
         * - prints a string
         * - can be used to print any type of data
         * - can be used to format the output
         * 
         */

        /*
         * PRINT PATERN
         * #
         * ##
         * ###
         * ####
         * 
         */

        System.out.println("\nPRINT PATERN");
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");

        // ==================== DATA TYPES ==================== \\
        /*
         * Data Types:
         * - primitive types
         * - reference types
         * 
         * Primitive Types:
         * - byte : 1byte
         * - short :
         * - int : 4 bytes
         * - long : 8 bytes
         * - float : 4 bytes
         * - double : 8 bytes
         * - char : 2 bytes
         * - boolean : 1 byte
         * 
         * Reference Types:
         * - String
         * - Arrays
         * - Classes
         * - Interfaces
         * 
         */

        // ==================== VARIABLES ==================== \\
        /*
         * Variables:
         * - name of a memory location
         * - used to store data
         * - can be used to store any type of data
         * - can be used to store multiple data
         * 
         * Variable Declaration:
         * - data_type variable_name;
         * 
         * Variable Initialization:
         * - variable_name = value;
         * 
         * Variable Declaration and Initialization:
         * - data_type variable_name = value;
         * 
         */

        String name = "Tony Stark";
        int age = 40;
        double price = 25.25;
        int a = 25;
        int b = 10;

        b = 20;
        name = "Ironman";

        int sum = a + b;
        System.out.println(sum);
        int diff = a - b;
        System.out.println(diff);
        int mul = a * b;
        System.out.println(mul);

        // ==================== INPUTS ==================== \\
        /*
         * Scanner:
         * - import java.util.Scanner;
         * - Scanner sc = new Scanner(System.in);
         * - sc.nextInt();
         * - sc.nextFloat();
         * - sc.nextDouble();
         * - sc.next();
         * - sc.nextLine();
         * - sc.close();
         * 
         */
        Scanner sc = new Scanner(System.in);
        // String myName = sc.next();
        String myName = sc.nextLine();
        System.out.println(myName);

        /*
         * Take 2 variables a & b and print the sum.
         */
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        sum = a + b;
        System.out.printf("Sum of %d and %d is %d", a, b, sum);

        sc.close();
    }
}
