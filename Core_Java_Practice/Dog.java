// example of static binding

class Dog
{
 private void eat()
 {
  System.out.println("eating...");
 }
 public static void main(String[] args)
 {
  Dog d1 = new Dog();
  d1.eat();
 }
} 
 