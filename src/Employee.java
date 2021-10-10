import java.util.Scanner;//importing Scanner class to take input from the user

public class Employee {
    public void emp(String name,int year,String next, String address){
        System.out.println(name+" "+year+" "+address);//printing name,year,address of the person
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //objects of the Employee class
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        obj1.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());
        obj2.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());
        obj3.emp(s.nextLine(),s.nextInt(),s.nextLine(),s.nextLine());

    }
}
