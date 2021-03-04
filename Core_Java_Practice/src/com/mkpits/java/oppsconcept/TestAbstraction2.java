// example of Abstract class in java.

abstract class TestBank
{
abstract int getRateOfInterest();
}
class TestSBI extends TestBank
{
 int getRateOfInterest()
 {
  return 7;
 }
}
class TestPNB extends TestBank
{
int getRateOfInterest()
 {
  return 8;
 }
}
class TestAXIS extends TestBank
{
int getRateOfInterest()
 {
  return 9;
 }
}
class TestAbstraction2
{
  public static void main(String[] args)
  {
      TestBank b;
    b = new TestSBI();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestPNB();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestAXIS();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
  }
}