// Exception handling with method overriding in java

import java.io.*;
class Parent
{
    void msg()
    {
    System.out.println("Parent");
    }
}

class TestExceptionMethodOveriding1 extends Parent
{
 void msg()throws ArithmeticException
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent p =new TestExceptionMethodOveriding1();
    p.msg();
  }
}


