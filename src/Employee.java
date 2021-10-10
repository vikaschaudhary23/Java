import java.util.Scanner;

public class Employee {
    public void emp(String name,int year,String next, String address){
        System.out.println(name+" "+year+" "+address);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        obj1.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());
        obj2.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());
        obj3.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());

    }
}
