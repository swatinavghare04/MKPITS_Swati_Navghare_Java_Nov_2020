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
void getemployeedata(String name,float salary)
{
  getpersondata(name);
 this.salary = salary;
 }
 void showemployeedata()
 {
	 showpersondata();
  System.out.println("Salary = " + salary);
 }
}

class parttimeemployee extends Employee
{
 int workinghours;  // instance variable
 void getparttimeemployeedata(String name,float salary,int workinghours)// local variable
 {
   getemployeedata(name,salary);
  this.workinghours = workinghours;
  }
 void showparttimeemployeedata()
 {
	 showemployeedata();
  System.out.println("Workinghours = " + workinghours);
 }
}

class TestInheritance01
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
   emp.getparttimeemployeedata(ename,sal,Whours);
   emp.showparttimeemployeedata();
  }
 }
