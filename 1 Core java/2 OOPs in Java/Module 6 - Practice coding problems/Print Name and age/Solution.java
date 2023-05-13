import java.util.* ;
// import java.io.*; 
class Person {
	
	private String name;
	private int age;

	public void setValue(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void getValue(){
		System.out.println("The name of the person is " + this.name + " and the age is " + this.age + ".");
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int age = sc.nextInt();

		Person p = new Person();
		p.setValue(name, age);
		p.getValue();
        sc.close();
	}
}
		