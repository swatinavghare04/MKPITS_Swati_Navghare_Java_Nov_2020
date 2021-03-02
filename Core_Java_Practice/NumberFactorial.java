//wap in java to accept a number and print the factorial of that number;

import java.util.*;
class NumberFactorial
{
	public static void main(String[] args)
	{
      int num,fact=1;
      Scanner s12 = new Scanner(System.in);
      System.out.println("enter number");
      num = s12.nextInt();
      while(num>0)
       {
	     fact = fact * num;
	     num--;
       }
    }
}