import java.util.Scanner;//importing Scanner class to take input from the user
public class Box {
    //instance variables
    int width;
    int height;
    int depth;

    public Box(int width, int height, int depth) //parameterized constructor
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int volume()//method to return volume of box
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Box obj = new Box(s.nextInt(),s.nextInt(),s.nextInt());//object of box class
        System.out.println(obj.volume());
    }
}
