// WAP in java Create a class book having methods getdata and showdata without parameter.

import java.util.*;
class Customer2{

   int custid;
   String custname;

   void getdata(){

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter customer id");
      custid = scan.nextInt();
      System.out.println("Enter customer name");
      custname = scan.next();
   }

   void showdata(){

      System.out.println("Customer id =" + custid);
      System.out.println("Customer name =" + custname);
   }
}

class TestCustomer2class{

   public static void main(String[] args){

      Customer2 c2 = new Customer2();
      c2.getdata();
      c2.showdata();
   }
}