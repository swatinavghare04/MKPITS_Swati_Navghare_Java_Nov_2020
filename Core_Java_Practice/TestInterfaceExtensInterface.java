// interface extends another interface

interface printable
{
 void print();
}
interface showable extends printable
{
 void show();
}
class TestInterfaceExtensInterface implements showable
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