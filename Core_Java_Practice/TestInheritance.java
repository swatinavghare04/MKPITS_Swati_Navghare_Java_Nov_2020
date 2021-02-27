// Multilevel inheritance
import java.util.*;
class Person
{
 String name;
 void getpersondata(String name)
 {
   this.name = name;
 }
 void showpersondata()
 {
   System.out.println("name = " + name);
 }
}

class Employee extends Person
{
 float salary;
void getemployeedata(float salary)
{
 this.salary = salary;
 }
 void showemployeedata()
 {
  System.out.println("Salary = " + salary);
 }
}

class parttimeemployee extends Employee
{
 int workinghours;  // instance variable
 void getparttimeemployeedata(int workinghours)// local variable
 {
  this.workinghours = workinghours;
  }
 void showparttimeemployeedata()
 {
  System.out.println("Workinghours = " + workinghours);
 }
}

class TestInheritance
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   parttimeemployee emp = new parttimeemployee();
   System.out.println("enter name");
   String ename = sc.next();
   System.out.println("enter salary");
   float sal = sc.nextFloat();
   System.out.println("enter workinghours");
   int Whours = sc.nextInt();
   emp.getpersondata(ename);
   emp.getemployeedata(sal);
   emp.getparttimeemployeedata(Whours);
   emp.showpersondata();
   emp.showemployeedata();
   emp.showparttimeemployeedata();
  }
 }
