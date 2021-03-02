package p2;

public class TestPackage
{
 int a = 20;
 void msg()
 {
    System.out.println("Hello" + a);
 }
  public void showmsg()
  {
   a = 40;
   msg();
  }
}