// write a java program of using final variable.

class TestFinalVariable
{
 final int speedlimit=20;

 void display()
 {
  System.out.println(speedlimit);
 }
 public static void main(String[] args)
 {
  TestFinalVariable b = new TestFinalVariable();
  b.display();
 }
}