// interface extends another interface

interface printable2
{
 void print();
}
interface showable1 extends printable2
{
 void show();
}
class TestInterfaceExtensInterface implements showable1
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
     TestInterfaceExtensInterface smp = new TestInterfaceExtensInterface();
  smp.print();
  smp.show();
 }
}