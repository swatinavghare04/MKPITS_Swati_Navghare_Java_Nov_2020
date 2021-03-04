
// WAP in java to illustrate downcasting without instance of operator

class TestAnimal4
{}
class DowncastingWithoutInstanceOf extends TestAnimal4
{
 static void method(TestAnimal4 a)
 {
     DowncastingWithoutInstanceOf d =(DowncastingWithoutInstanceOf)a;// downcasting
	  System.out.println("downcasting is performed");
 }
 public static void main(String[] args)
 {
     TestAnimal4 a = new DowncastingWithoutInstanceOf();
     DowncastingWithoutInstanceOf.method(a);
 }
}