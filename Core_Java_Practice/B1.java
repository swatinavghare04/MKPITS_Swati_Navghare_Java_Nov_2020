// covarient return type

class A
{
 A get()
 {
 return this;
 }
}
class B1 extends A
{
 B1 get()
 {
  return this;
 }
 void message()
 {
 System.out.println("Welcome to java");
 }
 public static void main(String[] args)
 {
 //new B1().get().message();
 B1 b = new B1();
 b.message();
}
}