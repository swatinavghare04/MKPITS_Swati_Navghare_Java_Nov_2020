// another example of interface.

 interface TestBank1
{
 float getRateOfInterest();
}
class TestSBI2 implements TestBank1
{
public float getRateOfInterest()
 {
  return 7.13f;
 }
}
class TestPNB2 implements TestBank1
{
public float getRateOfInterest()
 {
  return 8.03f;
 }
}
class TestAXIS2 implements TestBank1
{
public float getRateOfInterest()
 {
  return 9.45f;
 }
}
class TestInterface2
{
  public static void main(String[] args)
  {
      TestBank1 b;
    b = new TestSBI2();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestPNB2();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new TestAXIS2();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
  }
}