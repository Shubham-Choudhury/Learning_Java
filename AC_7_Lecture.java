public class AC_7_Lecture {
    public static void main(String[] args) {
        /*
         * ==================== FUNCTIONS & METHODS ====================
         * A function and a method is a block of code that performs a specific task.
         * 
         * ==================== FUNCTION ====================
         * A function is a block of code that performs a specific task.
         * A function is called by its name, optionally passing data to the function.
         * A function can optionally return data.
         * All data that is passed to a function is explicitly passed.
         * A function does not deal with Class and Object concepts.
         * 
         * ==================== METHOD ====================
         * A method is a block of code that is called by a name that is associated with
         * an object.
         * A method is implicitly passed the object on which it was called.
         * A method can return data.
         * A method may or may not deal with Class and Object concepts.
         * 
         * ==================== FUNCTION VS METHOD ====================
         * A function is a block of code that performs a specific task.
         * A method is a block of code that is called by a name that is associated with
         * an object.
         * 
         * returnType functionName(type arg1, type arg2 ..){
         * // body of the function
         * }
         */

        /*
         * A function is a block of code that performs a specific task.
         * 
         * ======= Why are functions used? =======
         * a. If some functionality is performed at multiple places in software, then
         * rather than writing the same code, again and again, we create a function and
         * call it everywhere. This helps reduce code redundancy.
         * b. Functions make maintenance of code easy as we have to change at one place
         * if we make future changes to the functionality.
         * c. Functions make the code more readable and easy to understand.
         * 
         * The syntax for function declaration is :
         * return-type function_name (parameter 1, parameter2, …… parameter n){
         * //function_body
         * }
         * 
         * return-type:
         * The return type of a function is the data type of the variable that that
         * function returns.
         * 
         * For eg - If we write a function that adds 2 integers and returns their sum
         * then the return type of this function will be ‘int’ as we will return a sum
         * that is an integer value.
         * When a function does not return any value, in that case the return type of
         * the function is ‘void’.
         * 
         * function_name:
         * It is the unique name of that function.
         * It is always recommended to declare a function before it is used.
         * 
         * Parameters:
         * A function can take some parameters as inputs. These parameters are specified
         * along with their data types.
         * For eg- if we are writing a function to add 2 integers, the parameters would
         * be passed like –
         * int add (int num1, int num2)
         * 
         * main function:
         * The main function is a special function as the computer starts running the
         * code from the beginning of the main function. Main function serves as the
         * entry point for the program.
         * 
         */

        // function to add 2 numbers
        int a = 10;
        int b = 20;
        sum(a, b);
        multiply(a, b);
        factorial(5);
    }

    // function to add 2 numbers
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }

    //  function to multiply 2 numbers.
    public static void multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);
    }

    // function to calculate the factorial of a number.
    public static void factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
