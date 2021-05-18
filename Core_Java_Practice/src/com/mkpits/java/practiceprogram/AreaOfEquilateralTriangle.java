// WAP to calculate the area of equilateral triangle.

package src.com.mkpits.java.practiceprogram;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter side of triangle");
       double a = sc.nextDouble();
       double area = (Math.sqrt(3)/4)*(a*a);
       System.out.println("Area of triangle is :" + area);
    }
}
