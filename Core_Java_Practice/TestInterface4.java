// interface extends another interface

interface printable
{
 void print();
}
interface showable extends printable
{
 void show();
}
class TestInterface4 implements showable
{
  public void print()
  {
   System.out.println("Hello");
  }
  public void show()
    {
     System.out.println("Welcome");
  }
 public static void main(String[] args)
 {
  TestInterface4 smp = new TestInterface4();
  smp.print();
  smp.show();
 }
}