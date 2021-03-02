
// downcasting by instanceOf operator

class Animal
{}
class DowncastingByInstanceOf extends Animal
{
 static void method(Animal a)
 {
  if(a instanceof DowncastingByInstanceOf)
  {
      DowncastingByInstanceOf d =(DowncastingByInstanceOf)a;// downcasting
	  System.out.println("downcasting is performed");
  }
 }
 public static void main(String[] args)
 {
	 Animal a = new DowncastingByInstanceOf();
     DowncastingByInstanceOf.method(a);
 }
}