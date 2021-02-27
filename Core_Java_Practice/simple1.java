// role of private constructor

class A1
{
private A(){}  // private constrctor
 void msg()
 {
   System.out.println("Hello Java");
 }
}

public class simple1
{
 public static void main(String[] args)
 {
  A obj = new A(); // compile time error
 }
}