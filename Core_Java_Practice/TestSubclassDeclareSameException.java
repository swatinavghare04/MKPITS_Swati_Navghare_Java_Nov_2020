// Example in case subclass overriden method declare same exception.

import java.io.*;
class Parent
{
    void msg()throws Exception
    {
    System.out.println("Parent");
    }
}

class TestSubclassDeclareSameException extends Parent
{
 void msg()throws Exception
 {
  System.out.println("Child");
 }
 public static void main(String[] args)
  {
    Parent p =new TestSubclassDeclareSameException();
    try
    {
    p.msg();
    }
    catch(Exception e)
   {}
  }
}


