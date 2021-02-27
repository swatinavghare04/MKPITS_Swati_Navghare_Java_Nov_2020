// example of Abstract class and abstract method

abstract class Bike
{
	abstract void run();

}
class Honda4 extends Bike
{
 void run()
 {
  System.out.println("Running safely");
 }
 public static void main(String[] args)
 {
 Bike B1 = new Honda4();
  B1.run();
 }
}
