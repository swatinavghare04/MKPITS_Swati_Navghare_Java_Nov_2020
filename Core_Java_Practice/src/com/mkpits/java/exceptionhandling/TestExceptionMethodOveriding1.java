// Exception handling with method overriding in java

import java.io.*;
class Parent1
{
    void msg()
    {
    System.out.println("Parent");
    }
}

class TestExceptionMethodOveriding1 extends Parent1
{
 void msg()throws ArithmeticException
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent1 p =new TestExceptionMethodOveriding1();
    p.msg();
  }
}


