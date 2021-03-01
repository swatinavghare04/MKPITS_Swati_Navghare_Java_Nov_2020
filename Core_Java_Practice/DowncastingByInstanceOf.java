
// downcasting by instance of operator

class Animal
{}
class Dog3 extends Animal
{
 static void method(Animal a)
 {
  if(a instanceof Dog3)
  {
	  Dog3 d =(Dog3)a;// downcasting
	  System.out.println("downcasting is performed");
  }
 }
 public static void main(String[] args)
 {
	 Animal a = new Dog3();
	 Dog3.method(a);
 }
}