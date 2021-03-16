// wap in java to accept a number and print whether it is a prime or not;

import java.util.*;
class NumberPrimeorNot
{
  public static void main(String[] args)
   {
   int num,i;
   System.out.println("enter the number");
   Scanner can = new Scanner(System.in);
   num = can.nextInt();
   for(i=2;i<=num;i++)
    {
      if(num%i==0)
      {
      break;
      }
    }
    if(i==num)
    System.out.println(num + " is a prime number");
    else
    System.out.println(num + " not a prime number");
   }
}