// Java interface Example

interface Drawable
{
 void draw();
}
class Circle1 implements Drawable
{
public void draw()
{
 System.out.println("draw circle");
}
}
class Rectangle1 implements Drawable
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
   Circle1 c = new Circle1();
   c.draw();
   Rectangle1 r = new Rectangle1();
   r.draw();
  }

}