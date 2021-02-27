// Java interface Example

interface Shape
{
 void draw1();
}
class Circle implements Shape
{
public void draw1()
{
 System.out.println("draw circle");
}
}

class TestInterface
{
  public static void main(String[] args)
  {
   Circle c = new Circle();
   c.draw1();
  }

}