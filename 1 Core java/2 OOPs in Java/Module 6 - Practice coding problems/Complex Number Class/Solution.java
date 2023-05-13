// import java.util.*;
// import java.io.*;
import java.util.Scanner;

class ComplexNumbers {
    private int R;
    private int I;

    public ComplexNumbers(int R, int I) {
        this.I = I;
        this.R = R;
    }

    public void Plus(ComplexNumbers C1) {
        this.I = C1.I + this.I;
        this.R = C1.R + this.R;
        Print();
    }

    public void Print() {
        System.out.println(this.R + " + i" + this.I);
    }

    public void Multiply(ComplexNumbers C1) {
        int temp = (this.R * C1.R) - (this.I * C1.I);
        this.I = (C1.R * this.I) + (C1.I * this.R);
        this.R = temp;
        Print();
    }

}

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int n = sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(a1, b1);
        ComplexNumbers c2 = new ComplexNumbers(a2, b2);
        switch (n) {
            case 1:
                c1.Plus(c2);
                break;
            case 2:
                c1.Multiply(c2);
                break;
        }

        sc.close();
    }
}

/*
 * Sample Input 1 :
 * 4 5
 * 6 7
 * 1
 * 
 * Sample Output 1 :
 * 10 + i12
 */

/*
 * Sample Input 2 :
 * 4 5
 * 6 7
 * 2
 * 
 * Sample Output 2 :
 * -11 + i58
 */