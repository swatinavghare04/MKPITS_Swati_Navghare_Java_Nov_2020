// program to fill the employee details - entered by user.

import java.util.*;
class Testemployee2
{
int empno;
String empname;
String designation;
float salary;

void getdata(int a,String b, String c,float d)
{
  empno = a;
  empname = b;
  designation = c;
  salary = d;
}
void showdata()
{
  System.out.println("-----------------------------------");
 System.out.println("---------employee Details---------");
 System.out.println("empno =" + empno);
 System.out.println("empname =" + empname);
 System.out.println("Designation =" + designation);
 System.out.println("Salary =" + salary);
 System.out.println("-------------------------------------");
}
}

class EmployeeDetailsEnteredbyUser
{
  public static void main(String[] args)
   {
       Testemployee2 emp = new Testemployee2();
     Scanner s1 = new Scanner(System.in);
     System.out.println("enter employee number");
     int em = s1.nextInt();
     System.out.println("enter employee name");
      String e1 = s1.next();
     System.out.println("enter employee Designation");
     String e2 = s1.next();
     System.out.println("enter employee salary");
     float e3 = s1.nextFloat();
     emp.getdata(em,e1,e2,e3);
      emp.showdata();
}
}