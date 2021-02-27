
// downcasting by instance of operator

class Animal
{}
class dog11 extends Animal
{
 static void method(Animal a)
 {
  if(a instance of dog11)
  {
	  dog11 d =(dog11)a;// downcasting
	  System.out.println("downcasting is performed");
  }
 }
 public static void main(String[] args)
 {
	 Animal a = new dog11();
	 dog11.method(a);
 }
}