public class AC_6_Lecture_Homework {
    public static void main(String[] args) {
        int rows = 5;
        /*
         * ======================= hollow Rhombus =======================
         * -----######
         * ----#----#
         * ---#----#
         * --#----#
         * -#----#
         * ######
         */
        System.out.println("====================== hollow Rhombus =======================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        /*
         * =========================== hollow Butterfly ====================
         * #----------#
         * ##--------##
         * #-#------#-#
         * #--#----#--#
         * #---#--#---#
         * #----##----#
         * #----##----#
         * #---#--#---#
         * #--#----#--#
         * #-#------#-#
         * ##--------##
         * #----------#
         */
        System.out.println("========================== hollow Butterfly ====================");

         for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                if(j==0 || j==i){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j < rows-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                if(j==0 || j==i){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = rows; i > 0; i--){
            for(int j = i; j > 0; j--){
                if(j==i || j==1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = i; j < rows; j++){
                System.out.print("  ");
            }
            for(int j = i; j > 0; j--){
                if(j==i || j==1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
