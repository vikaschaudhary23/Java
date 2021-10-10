import java.util.Scanner;
public class Box {
    int width;
    int height;
    int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Box obj = new Box(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(obj.volume());
    }
}
