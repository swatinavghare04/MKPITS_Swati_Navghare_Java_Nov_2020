//  WAP to that takes three numbers(x,y,z) as input and print the output of (x+y).z and x.y + y.z.

import java.util.*;
class EquationResult{

   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Eneter three numbers");
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int result1 = (x+y)*z;
      int result2 = (x*y) + (y*z);
      System.out.println("Result of first equation = "+ result1);
      System.out.println("Result of second equation = "+ result2);
   }
} 
