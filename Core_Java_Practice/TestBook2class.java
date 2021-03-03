
// WAP in java Create a class book having methods getdata and showdatat without parameter.

import java.util.*;
class Book2{

   int bookid;
   String bookname;

   void getdata(){

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter book id");
      bookid = scan.nextInt();
      System.out.println("Enter book name");
      bookname = scan.next();
   }

   void showdata(){

      System.out.println("Book id =" + bookid);
      System.out.println("Book name =" + bookname);
   }
}

class TestBook2class{

   public static void main(String[] args){

      Book2 b2 = new Book2();
      b2.getdata();
      b2.showdata();
   }
}