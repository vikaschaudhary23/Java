import java.util.Scanner;
public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle obj1 = new Rectangle(s.nextInt(),s.nextInt());
        Rectangle obj2 = new Rectangle(s.nextInt(),s.nextInt());
        System.out.println(obj1.area());
        System.out.println(obj2.area());
    }
}
