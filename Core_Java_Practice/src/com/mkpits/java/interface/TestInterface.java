// WAP in Java to illustrate interface Example.

interface printable1
{
 void print();
}
class TestInterface implements printable1
{
  public void print()
   {
     System.out.println("Hello");
   }

  public static void main(String[] args)
  {
      TestInterface obj = new TestInterface();
   obj.print();
  }
}