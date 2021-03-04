// example of static binding

class TestStaticBinding
{
 private void eat()
 {
  System.out.println("eating...");
 }
 public static void main(String[] args)
 {
  TestStaticBinding d1 = new TestStaticBinding();
  d1.eat();
 }
} 
 