// example of dynamic binding

class Animal
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class TestDynamicBinding extends Animal
{
 void eat()
 {
  System.out.println("Dog is eating...");
 }
 public static void main(String[] args)
 {
  Animal d1 = new TestDynamicBinding();
  d1.eat();
 }
}
