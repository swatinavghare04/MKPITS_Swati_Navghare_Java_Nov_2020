// example of dynamic binding

class TestAnimal3
{
	void eat()
	{
		System.out.println("Animal is eating...");
	}
}
class TestDynamicBinding extends TestAnimal3
{
 void eat()
 {
  System.out.println("Dog is eating...");
 }
 public static void main(String[] args)
 {
     TestAnimal3 d1 = new TestDynamicBinding();
  d1.eat();
 }
}
