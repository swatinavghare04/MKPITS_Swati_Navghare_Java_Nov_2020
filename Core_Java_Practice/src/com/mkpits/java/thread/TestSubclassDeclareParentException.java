// Example in case subclass overriden method declare parent exception.

import java.io.*;
class TestParent2
{
    void msg()throws ArithmeticException
    {
    System.out.println("Parent");
    }
}

class TestSubclassDeclareParentException extends TestParent2
{
 void msg()throws Exception
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
      TestParent2 p =new TestSubclassDeclareParentException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


