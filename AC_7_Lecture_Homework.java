public class AC_7_Lecture_Homework {
    public static void main(String[] args) {
        checkPrime(12342);
        checkPrime(11);

        checkEven(12342);
        checkEven(11);

        printTable(8);
    }

    // function to check if a number is prime or not.
    public static void checkPrime(int num){
        boolean prime = true;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }

        if(prime){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // function to check if a given number n is even or not
    public static void checkEven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
    }

    //  function to print the table of a given number n.
    public static void printTable(int num){
        System.out.printf("\nTable of %d:\n", num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
