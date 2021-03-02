// Example in case subclass overriden method declares no exception.

import java.io.*;
class Parent
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSubclassDeclareNoException extends Parent
{
 void msg()
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent p =new TestSubclassDeclareNoException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


