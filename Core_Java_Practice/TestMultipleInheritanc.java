// Example of multiple inheritance in java

interface printable
{
 void print();
}
interface showable
{
 void show();
}
class TestMultipleInheritance implements printable,showable
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
    A7 obj1 = new A7();
    obj1.print();
    obj1.show();
   }
 }
