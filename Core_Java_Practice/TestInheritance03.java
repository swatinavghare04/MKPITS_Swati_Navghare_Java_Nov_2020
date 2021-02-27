// example of method overriding and overloading

import java.util.*;
class person
{
 String name;
 void getdata(String name)
 {
  this.name = name;
 }
 void showdata()
{
 System.out.println("name = " + name);
}
}

class employee extends person
{
 float salary;

 // method overloading

 void getdata(String name,float salary)
{
  getdata(name);
  this.salary = salary;
 }

 //method overriding

void showdata()
{
 super.showdata();  // call super class(person) showdata method
 System.out.println("salary = " + salary);
}
}

class parttimeemployee extends employee
{
 int workinghours;
 void getdata(String name,float salary,int workinghours)
 {
  getdata(name,salary);
  this.workinghours = workinghours;
 }
 void showdata()
 {
   super.showdata(); // call super class(employee) showdata method
   System.out.println("workinghours = " + workinghours);
  }
 }

class TestInheritance03
{
 public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   parttimeemployee emp = new parttimeemployee();
   System.out.println("enter name");
   String ename = scan.next();
   System.out.println("enter salary");
   float sal = scan.nextFloat();
   System.out.println("enter workinhours");
   int whours = scan.nextInt();
   emp.getdata(ename,sal,whours);
   emp.showdata();
  }
 }


