
// WAP in java to illustrate downcasting by instanceOf operator

class TestAnimal2
{}
class DowncastingByInstanceOf extends TestAnimal2
{
 static void method(TestAnimal2 a)
 {
  if(a instanceof DowncastingByInstanceOf)
  {
      DowncastingByInstanceOf d =(DowncastingByInstanceOf)a;// downcasting
	  System.out.println("downcasting is performed");
  }
 }
 public static void main(String[] args)
 {
  TestAnimal2 a = new DowncastingByInstanceOf();
     DowncastingByInstanceOf.method(a);
 }
}