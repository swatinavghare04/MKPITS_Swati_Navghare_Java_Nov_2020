
// downcasting without instance of operator

class Animal
{}
class Dog4 extends Animal
{
 static void method(Animal a)
 {
	  Dog4 d =(Dog4)a;// downcasting
	  System.out.println("downcasting is performed");
 }
 public static void main(String[] args)
 {
	 Animal a = new Dog4();
	 Dog4.method(a);
 }
}