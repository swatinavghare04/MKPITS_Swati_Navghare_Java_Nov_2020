// Example in case subclass overriden method declare subclass exception.

import java.io.*;
class Parent
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSublassDeclareSubclassException extends Parent
{
 void msg()throws ArithmeticException
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent p =new TestSublassDeclareSubclassException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}
