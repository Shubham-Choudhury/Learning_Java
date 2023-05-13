# **Polynomial class**

## **Problem Statement**

Implement a polynomial class with the following properties and functions.

**Properties :**

1. An integer (let's say A) which holds the coefficient and degrees. Use array indices as degree and A[i] as the coefficient of ith degree.

2. An integer holding the total size of array A.

**Functions :**

1. Default constructor

2. Copy constructor

3. setCoefficient -

This function sets coefficient for a particular degree value. If the given degree is greater than the current polynomial capacity, increase the capacity accordingly and set the required coefficient. If the degree is within limits, the previous coefficient value is replaced by the given coefficient value.

4. Overload "+" operator (P3 = P1 + P2) -

Adds two polynomials and returns a new polynomial that has the result.

5. Overload "-" operator  (P3 = p1 - p2) :

Subtracts two polynomials and returns a new polynomial which has the result.

6. Overload "*" operator (P3 = P1 * P2) -

Multiplies two polynomials and returns a new polynomial which has the result.

7. Overload "=" operator (Copy assignment operator) -

Assigns all values of one polynomial to the other.

8. print() -

Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.

**Print pattern for a single term : &lt;coefficient&gt;"x"&lt;degree&gt;**

And multiple terms should be printed separated by space. And after printing one polynomial, print a new line. For more clarity, refer to sample test cases.

## **Detailed explanation**

**Input Format :**

    The first line of the input contains an integer N, representing the total number of terms in polynomial P1.

    The second line of the input contains N space-separated integers representing the degree of P1.

    The third line of the input contains N space-separated integers representing coefficients of P1.

    The fourth line of the input contains an integer M, representing the total number of terms in polynomial P2.

    The fifth line of the input contains M space-separated integers representing the degree of P2.

    The sixth line of the input contains M space-separated integers representing coefficients of P2.

    The seventh line of the input contains an integer C, representing the function's choice to be called, i.e., if choice =1 add if choice=2 subtract and choice=3 multiply.

**