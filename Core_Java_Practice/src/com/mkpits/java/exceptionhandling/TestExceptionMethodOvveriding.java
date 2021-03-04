// Exception handling with method overriding in java

import java.io.*;
class Parent
{
    void msg()
    {
    System.out.println("Parent");
    }
}

class TestExceptionMethodOvveriding extends Parent
{
 void msg()
 {
  System.out.println("TestExceptionChild");
 }
 public static void main(String[] args)
  {
    Parent p =new TestExceptionMethodOvveriding();
    p.msg();
  }
}