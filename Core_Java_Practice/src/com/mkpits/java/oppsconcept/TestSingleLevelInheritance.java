// Single level inheritance

class Animal
{
 void eat()
 {
  System.out.println("eating...");
 }
}
class Dog extends Animal
{
 void bark()
 {
  System.out.println("barking...");
 }
}
class cat extends Animal
{
 void meow()
 {
  System.out.println("Meow...");
 }
}

class TestSingleLevelInheritance
{
public static void main(String[] args)
{
 cat c = new cat();
 c.meow();
 c.eat();
 // c.bark();  // compile time error
 Dog d = new Dog();
 d.bark();
 d.eat();
}
}

