import java.util.Scanner;//importing Scanner class to take input from the user
public class Employee0 {
 int salary;
 int hours;
 public void getInfo(int salary, int hours)//method which will take salary and hours as parameters
 {
  this.salary = salary;
  this.hours = hours;
 }
 public void AddSal(){
  if(salary<500){
   salary += 20;
  }
 }
 public void  AddWork() {
  if (hours > 6) {
   salary += 5;
  }
 }
 public int display(){
  return salary;
 }

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  Employee0 obj = new Employee0();//making object of Employee0 class
  //calling functions
  obj.getInfo(a,b);
  obj.AddSal();
  obj.AddWork();
  System.out.println(obj.display());//printing the final salary
 }

}
