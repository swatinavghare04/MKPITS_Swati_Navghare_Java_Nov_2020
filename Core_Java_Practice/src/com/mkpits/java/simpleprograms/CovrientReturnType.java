
class TestA4
{
 TestA4 get()
 {
 return this;
 }
}
class CovrientReturnType extends TestA4
{
 CovrientReturnType get()
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
  CovrientReturnType b = new CovrientReturnType();
 b.message();
}
}