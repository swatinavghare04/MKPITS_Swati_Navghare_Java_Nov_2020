
import java.lang.*;
class parent
{}
class tob extends parent
{
  public static void main(String[] args)
  {
    parent t = new parent();
    Object obj = t.getClass();
    System.out.println("obj =" +obj);
  }
}