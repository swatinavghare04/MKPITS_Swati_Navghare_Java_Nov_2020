

abstract class Bank1
{
 abstract int getRateOfInterest();
}
class TestSBI1 extends Bank1
{
int getRateOfInterest()
 {
  return 7;
 }
}
class TestPNB1 extends Bank1
{
int getRateOfInterest()
 {
  return 8;
 }
}
class TestAXIS1 extends Bank1
{
int getRateOfInterest()
 {
  return 9;
 }
}
class TestAbstract3
{
  public static void main(String[] args)
  {
    Bank1 b;
    b = new TestSBI1();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestPNB1();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestAXIS1();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
  }
}