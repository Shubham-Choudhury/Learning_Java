public class AC_5_Lecture_Homework {
    public static void main(String[] args) {
        int rows = 6;
        /*
         * ======================= SOLID RHOMBUS =======================
         * -----######
         * ----###### 
         * ---###### 
         * --######
         * -######
         * ######
         */

        System.out.println("====================== SOLID RHOMBUS =======================");
        for(int i = rows; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < rows; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= palindromic number pyramid =======================
         * ----1
         * ---212
         * --32123
         * -4321234
         * 543212345
         */

        System.out.println("====================== palindromic number pyramid =======================");
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= Number Pyramid =======================
         * ----1
         * ---2-2
         * --3-3-3
         * -4-4-4-4
         * 5-5-5-5-5
         */

        System.out.println("====================== Number Pyramid =======================");
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
