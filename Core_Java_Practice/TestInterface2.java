// another example of interface.

 interface Bank
{
 float getRateOfInterest();
}
class SBI implements Bank
{
public float getRateOfInterest()
 {
  return 7.13f;
 }
}
class PNB implements Bank
{
public float getRateOfInterest()
 {
  return 8.03f;
 }
}
class AXIS implements Bank
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
    Bank b;
    b = new SBI();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new PNB();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
    b = new AXIS();
    System.out.println("Rate of Interest is "+ b.getRateOfInterest()+ "%");
  }
}