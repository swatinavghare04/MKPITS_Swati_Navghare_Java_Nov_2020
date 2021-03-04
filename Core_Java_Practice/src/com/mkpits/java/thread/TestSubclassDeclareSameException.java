// Example in case subclass overriden method declare same exception.

import java.io.*;
class TestParent3
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSubclassDeclareSameException extends TestParent3
{
 void msg()throws Exception
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    TestParent3 p =new TestSubclassDeclareSameException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


