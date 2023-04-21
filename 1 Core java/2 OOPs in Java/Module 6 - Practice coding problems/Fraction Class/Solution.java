import java.util.* ;
import java.io.*; 

class Fraction {

	public int numerator;
	public int denominator;

	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void Add(Fraction a){
		int tempD = this.denominator * a.denominator;
		this.numerator = (this.numerator * a.denominator) + (a.numerator * this.denominator);
		this.denominator = tempD;
	}

	public void multiply(Fraction a){
		this.numerator = this.numerator * a.numerator;
		this.denominator = this.denominator * a.denominator;
	}

	public void simplify(){
		int temp = gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / temp;
		this.denominator = this.denominator / temp;
	}

	public void Print(){
		simplify();
		System.out.println(this.numerator + "/" + this.denominator);
	}

	public int gcd(int a, int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b, a%b);
		}
	}

}

class Solution {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int op;

		Fraction f1 =new Fraction(a, b);

		int num = sc.nextInt();

		for(int i = 0; i < num; i++){
			op = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();

			Fraction f2 = new Fraction(a, b);

			if(op == 1){
				f1.Add(f2);
				f1.Print();
			}
			else{
				f1.multiply(f2);
				f1.Print();
			}
		}

        sc.close();
	}
}
