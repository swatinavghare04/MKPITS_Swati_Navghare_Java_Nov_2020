// another example of multiple inheritance using interface

interface printable
{
 void print();
}
interface showable
{
 void print();
}
class TestMultpleInherit implements printable,showable
{
  public void print()
  {
   System.out.println("Hello");
  }
 public static void main(String[] args)
 {
  TestMultpleInherit tmi = new TestMultpleInherit();
  tmi.print();
 }
}