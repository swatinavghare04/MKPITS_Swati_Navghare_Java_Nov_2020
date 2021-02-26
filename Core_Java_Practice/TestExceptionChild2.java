// Example in case subclass overriden method declare parent exception.

import java.io.*;
class Parent
{
    void msg()throws ArithmeticException
    {
    System.out.println("Parent");
    }
}

class TestExceptionChild2 extends Parent
{
 void msg()throws Exception
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent p =new TestExceptionChild2();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


