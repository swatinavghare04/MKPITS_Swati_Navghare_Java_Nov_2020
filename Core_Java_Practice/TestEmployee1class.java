// WAP to create a class eployee having field empno and empname and accept the values from the user.

import java.util.*;
class Employee1{

   int empno;
   String empname;
}

class TestEmployee1class{

   public static void main(String[] arsg){

      Employee1 e2 = new Employee1();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number of the employee");
      e2.empno = scan.nextInt();
      System.out.println("Enter name of the employee");
      e2.empname = scan.next();
      System.out.println("Employee number = " + e2.empno);
      System.out.println("Employee name = " + e2.empname);
   }
}