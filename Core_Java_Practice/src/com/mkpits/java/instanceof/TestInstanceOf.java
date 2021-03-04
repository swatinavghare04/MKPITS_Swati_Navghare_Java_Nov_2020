//use of instanceof operator

interface Testprintable
{}
class A implements Testprintable
{
 public void a()
 {
  System.out.println("a method");
 }
}
class B implements Testprintable
{
 public void b()
 {
  System.out.println("b method");
 }
}
class Call
{
 void invoke(Testprintable p)
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
    Testprintable p = new B();
    Call c = new Call();
    c.invoke(p);
   }
 }

