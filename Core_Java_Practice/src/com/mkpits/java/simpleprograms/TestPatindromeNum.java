// WAP in java to check whether entered number is palindrome or not.

import java.util.*;
class TestPatindromeNum{
   public static void main(String[] args){

    /* int a,b,c,d,e,f;
      System.out.println("enter number");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      c = a%10;
      b=c;
      c=a/10;
      d=c;
      c=d%10;
      e=c;
      c=d/10;
      f= ((b*100)+(e*10)+c);
      System.out.println(f);
      if(a==f)
      System.out.println("Number is palindrome");
      else
      System.out.println("Number is not palindrome");  */

      int r,sum =0, temp;
      System.out.println("Enter Number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      temp=n;
      while(n>0){

		  r = n%10;
		  sum = (sum*10)+r;
		  n=n/10;
	  }
	  if(temp==sum)
	  System.out.println("Number is palindrome");
	  else
	  System.out.println("Number is not palindrome");
   }
}