// Example in case subclass overriden method declares no exception.

import java.io.*;
class TestParent4
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSubclassDeclareNoException extends TestParent4
{
 void msg()
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
      TestParent4 p =new TestSubclassDeclareNoException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


