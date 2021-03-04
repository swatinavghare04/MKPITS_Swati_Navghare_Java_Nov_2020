// WAP to create a class student having fields rno and name and accept the values from the user.

import java.util.*;
class Student1{

   int rno;
   String name;
}

class TestStudent1class{

   public static void main(String[] arsg){

      Student1 s2 = new Student1();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter roll number of the student");
      s2.rno = scan.nextInt();
      System.out.println("Enter name of the student");
      s2.name = scan.next();
      System.out.println("Student roll number = " + s2.rno);
      System.out.println("Student name = " + s2.name);
   }
}