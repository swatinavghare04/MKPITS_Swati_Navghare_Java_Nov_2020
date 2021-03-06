// example of Abstract class and abstract method

abstract class Bike
{
	abstract void run();

}
class AbstractClassandMethod extends Bike
{
 void run()
 {
  System.out.println("Running safely");
 }
 public static void main(String[] args)
 {
 Bike B1 = new AbstractClassandMethod();
  B1.run();
 }
}
