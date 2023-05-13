import java.util.* ;
// import java.io.*; 
class Rectangle { 
    int length;
    int breadth;

    public int getArea(){
        return (this.length * this.breadth);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.length = sc.nextInt();
        r.breadth = sc.nextInt();
        System.out.println(r.getArea());
        sc.close();
    }
}