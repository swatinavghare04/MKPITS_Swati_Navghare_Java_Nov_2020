// WAP in java in case subclass overriden method declare subclass exception.

import java.io.*;
class TestParentclass
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSublassDeclareSubclassException extends TestParentclass
{
 void msg()throws ArithmeticException
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
      TestParentclass p =new TestSublassDeclareSubclassException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}
