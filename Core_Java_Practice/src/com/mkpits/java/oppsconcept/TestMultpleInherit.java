// another example of multiple inheritance using interface

interface TestprintableMulti
{
 void print();
}
interface TestshowableMulti
{
 void print();
}
class TestMultpleInherit implements TestprintableMulti,TestshowableMulti
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