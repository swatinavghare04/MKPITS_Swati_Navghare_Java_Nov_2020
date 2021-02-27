// The circle class

import java.util.*;
class circle
{
 private double radius;
 private String color;
 float pi = 3.14f;
 circle()
 {
   double radius = 1.0;
  String color = "Red";
 }
 circle(double rad , String col)
 {
  radius = rad;
  color = col;
 }
void getRadius()
 {
   System.out.println("radius ="+ radius);
 }
void setRadius()
 {
	 System.out.println("enter radius");
 }
 void getColor()
  {
    System.out.println("color ="+ color);
  }
 void setColor()
  {
 	 System.out.println("enter color");
 }
 public double getArea()
 {
   System.out.println("area = " + pi*radius*radius);
 }
}
class inherit
{
  public static void main(String[] args)
  {
	 Scanner scan = new Scanner(System.in);
     circle c1 = new circle();
     c1.setRadius();
     double r = scan.nextDouble();
     c1.getRadius();
     c1.setColor();
     String co = scan.next();
     c1.getColor();
     c1.getArea();
     circle c2 = new circle(12,"green");
 }
}