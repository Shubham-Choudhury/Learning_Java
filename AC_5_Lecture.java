import java.util.Scanner;

public class AC_5_Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * ======================= SOLID RECTANGLE =======================
         * #####
         * #####
         * #####
         * #####
         */
        System.out.println("====================== SOLID RECTANGLE =======================");
        int rows = 5;
        int columns = 7;
        System.out.println("Enter the number of rows: " + rows);
        System.out.println("Enter the number of columns: " + columns);
        // System.out.print("Enter the number of rows: ");
        // int rows = sc.nextInt();
        // System.out.println("Enter the number of columns: ");
        // int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= HOLLOW RECTANGLE =======================
         * #####
         * # #
         * # #
         * #####
         */
        System.out.println("====================== HOLLOW RECTANGLE =======================");
        rows = 5;
        columns = 7;
        System.out.println("Enter the number of rows: " + rows);
        System.out.println("Enter the number of columns: " + columns);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        // System.out.println("Enter the number of columns: ");
        // columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= HALF PYRAMID =======================
         * #
         * ##
         * ###
         * ####
         * #####
         * ######
         */
        System.out.println("====================== HALF PYRAMID =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= INVERTED HALF PYRAMID =======================
         * #####
         * ####
         * ###
         * ##
         * #
         */

        System.out.println("====================== INVERTED HALF PYRAMID =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ========= INVERTED HALF PYRAMID (rotated by 180 deg) ==========
         * -----#
         * ----##
         * ---###
         * --####
         * -#####
         * ######
         */

        System.out.println("======== INVERTED HALF PYRAMID (rotated by 180 deg) ==========");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

         /*
         * ======================= HALF PYRAMID WITH NUMBERS =======================
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         */
        System.out.println("====================== HALF PYRAMID WITH NUMBERS =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= HALF PYRAMID WITH NUMBERS (reversed) =======================
         * 123456
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */

        System.out.println("====================== HALF PYRAMID WITH NUMBERS (reversed) =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= FLOYD'S TRIANGLE =======================
         * 1 
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * 16 17 18 19 20 21
         */
        System.out.println("====================== FLOYD'S TRIANGLE =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= 1 - 0 TRIANGLE =======================
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * 0 1 0 1 0 1
         */

        System.out.println("====================== 1 - 0 TRIANGLE =======================");
        rows = 6;
        System.out.println("Enter the number of rows: " + rows);
        // System.out.print("Enter the number of rows: ");
        // rows = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= i+1; j++){
                System.out.print((j+i)%2);
            }
            System.out.println();
        }
        System.out.println("\n");
        


        sc.close();
    }
}
