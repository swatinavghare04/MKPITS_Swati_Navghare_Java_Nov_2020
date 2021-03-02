// WAP in jav to understand simple example on abstraction.

abstract class shape
{
 abstract void draw();
}
class Rectangle extends shape
{
 void draw()
 {
   System.out.println("Drawl rectangle...");
 }
}
class Circle extends shape
{
 void draw()
 {
   System.out.println("Drawl circle...");
 }
}
class TestAbstraction1
{
  public static void main(String[] args)
  {
    shape s = new Rectangle();
    s.draw();
    shape s1 = new Circle();
    s1.draw();

  }
}