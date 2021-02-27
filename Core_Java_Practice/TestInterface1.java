// Java interface Example

interface Drawable
{
 void draw();
}
class Circle implements Drawable
{
public void draw()
{
 System.out.println("draw circle");
}
}
class Rectangle implements Drawable
{
public void draw()
{
 System.out.println("draw Rectangle");
}
}

class TestInterface1
{
  public static void main(String[] args)
  {
   Circle c = new Circle();
   c.draw();
   Rectangle r = new Rectangle();
   r.draw();
  }

}