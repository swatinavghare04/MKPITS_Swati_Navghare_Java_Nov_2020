//  Example on Aggregation
import java.util.*;
class Operation
{
 int square(int r)
 {
  return r*r;
 }
}
// creating a class circle

class Circle
{
 Operation op;
 double pi = 3.14;
 double area(int r)
 {
  Operation op = new Operation();
  int sq = op.square(r);
  double ar = pi*sq;
  return ar;
 }
}

class aggregationex1
{
  public static void main(String[] args)
  {
	Scanner scan = new Scanner(System.in);
   Circle c = new Circle();
   System.out.println("enter radius");
   int radius = scan.nextInt();
   double res = c.area(radius);
   System.out.println("Area = " + res);
}
}