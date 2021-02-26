// Exception handling with method overriding in java

import java.io.*;
class Parent
{
    void msg()
    {
    System.out.println("Parent");
    }
}

class TestExceptionChild extends Parent
{
 void msg()throws IOException
 {
  System.out.println("TestExceptionChile");
 }
 public static void main(String[] args)
  {
    Parent p =new TestExceptionChild();
    p.msg();
  }
}