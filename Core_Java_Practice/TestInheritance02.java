// Multilevel inheritance
import java.util.*;
class Person
{
 String name;
 String address;
 void getpersondata(String name,String address)
 {
   this.name = name;
   this.address = address;
 }
 void showpersondata()
 {
   System.out.println("name = " + name);
   System.out.println("address = " + address);
 }
}

class student extends Person
{
  int rollno;
 int marks;
void getstudentdata(String name,String address,int rollno,int marks)
{
  getpersondata(name,address);
 this.rollno = rollno;
 this.marks = marks;
 }
 void showstudentdata()
 {
	 showpersondata();
  System.out.println("rollno = " + rollno);
  System.out.println("marks = " + marks);
 }
}

class parttimestudent extends student
{
 int noofhours;  // instance variable
 void getparttimestudentdata(String name,String address,int rollno,int marks,int workinghours)// local variable
 {
   getstudentdata(name,address,rollno,marks);
  this.noofhours = noofhours;
  }
 void showparttimestudentdata()
 {
	 showstudentdata();
  System.out.println("noofhours = " + noofhours);
 }
}

class TestInheritance02
{
  public static void main(String[] args)
  {
   Scanner sc1 = new Scanner(System.in);
   parttimestudent stud = new parttimestudent();
   System.out.println("enter name");
   String ename = sc1.next();
   System.out.println("enter address");
   String add = sc1.next();
   System.out.println("enter roll no");
   int rno = sc1.nextInt();
   System.out.println("enter marks");
   int mrks = sc1.nextInt();
   System.out.println("enter number of hours");
   int numofhours = sc1.nextInt();
   stud.getparttimestudentdata(ename,add,rno,mrks,numofhours);
   stud.showparttimestudentdata();
  }
 }
