// Example of parameterized constructor.

public class Test01
{
 Test01(int a, int b)
 {
   System.out.println("a =" +a + "b =" +b);
 }
 Test01(int a, float b)
  {
    System.out.println("a =" +a + "b =" +b);
 }
 public static void main(String[] args)
 {
  byte a = 10;
  byte b = 15;
  Test01 test = new Test01(a,b);
  }
 }