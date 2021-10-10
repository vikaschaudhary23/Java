import java.util.Scanner;//importing Scanner class to take input from the user
public class Rectangle {
    //instance variables
    int length;
    int breadth;

    public Rectangle(int length, int breadth) //parameterized constructor
     {
        this.length = length;
        this.breadth = breadth;
    }
    public int area()//method to return the area of rectangle
    {
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //objects of the Rectangle class
        Rectangle obj1 = new Rectangle(s.nextInt(),s.nextInt());
        Rectangle obj2 = new Rectangle(s.nextInt(),s.nextInt());
        System.out.println(obj1.area());
        System.out.println(obj2.area());
    }
}
