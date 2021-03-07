// WAP in java to demonstrate Single level inheritance.

class TestAnimalInheritance
{
 void eat()
 {
  System.out.println("eating...");
 }
}
class Dog extends TestAnimalInheritance
{
 void bark()
 {
  System.out.println("barking...");
 }
}
class cat extends TestAnimalInheritance
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

