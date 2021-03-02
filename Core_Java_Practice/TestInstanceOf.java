//use of instanceof operator

interface printable
{}
class A implements printable
{
 public void a()
 {
  System.out.println("a method");
 }
}
class B implements printable
{
 public void b()
 {
  System.out.println("b method");
 }
}
class Call
{
 void invoke(printable p)
{

// upcasting
if(p instanceof A)
 {
 A a = (A)p; // downcasting
 a.a();
 }

 if(p instanceof B)
 {
  B b = (B)p; //downcasting
  b.b();
 }
 }
 } // end of class

 class TestInstanceOf
 {
   public static void main(String[] args)
   {
    printable p = new B();
    Call c = new Call();
    c.invoke(p);
   }
 }

