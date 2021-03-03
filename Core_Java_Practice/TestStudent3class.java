// WAP to create a class student having fields rno and name and method getdata and showdata.

import java.util.*;
class Student3{

   int rno;
   String name;

   void getdata(){

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter roll number");
      rno = scan.nextInt();
      System.out.println("Enter name");
      name = scan.next();
   }

   void showdata(){

      System.out.println("Student roll number =" + rno);
      System.out.println("Student name =" + name);
   }
}

class TestStudent3class{

   public static void main(String[] args){

      Student3 s3 = new Student3();
      s3.getdata();
      s3.showdata();
   }
}