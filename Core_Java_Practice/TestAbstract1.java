// exampe of abstraction

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
class TestAbstract1
{
  public static void main(String[] args)
  {
    shape s = new Rectangle();
    s.draw();
    shape s1 = new Circle();
    s1.draw();

  }
}