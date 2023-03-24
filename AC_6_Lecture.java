public class AC_6_Lecture {
    public static void main(String[] args) {
        int rows = 6;

        /*
         * ======================= BUTTERFLY PATTERN =======================
         * #----------# 
         * ##--------## 
         * ###------### 
         * ####----#### 
         * #####--##### 
         * ############ 
         * ############ 
         * #####--##### 
         * ####----#### 
         * ###------### 
         * ##--------## 
         * #----------#
         */

        System.out.println("====================== BUTTERFLY PATTERN =======================");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            for(int j = 0; j < rows-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i = rows; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("#");
            }
            for(int j = i; j < rows; j++){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * ======================= DIAMOND PATTERN =======================
         * ----# 
         * ---### 
         * --##### 
         * -####### 
         * ######### 
         * ######### 
         * -####### 
         * --##### 
         * ---### 
         * ----# 
         */

        System.out.println("====================== DIAMOND PATTERN =======================");
        for(int i = 1; i <= rows; i++){
            for(int j = 0; j < rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(int i = rows; i > 0; i--){
            for(int j = i; j < rows; j++){
                System.out.print(" ");
            }
            for(int j = 1; j < (i*2); j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
