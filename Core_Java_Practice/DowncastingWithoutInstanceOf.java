
// downcasting without instance of operator

class Animal
{}
class DowncastingWithoutInstanceOf extends Animal
{
 static void method(Animal a)
 {
     DowncastingWithoutInstanceOf d =(DowncastingWithoutInstanceOf)a;// downcasting
	  System.out.println("downcasting is performed");
 }
 public static void main(String[] args)
 {
	 Animal a = new DowncastingWithoutInstanceOf();
     DowncastingWithoutInstanceOf.method(a);
 }
}