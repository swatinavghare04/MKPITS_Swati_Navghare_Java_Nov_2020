// wap in java to display the first n term of fibonacci series;

import java.util.*;
class PrintFibonacciSeries
{
  public static void main(String[] args)
  {
     int n,i,a=-1,b=1,c;
     Scanner sdt = new Scanner(System.in);
    System.out.println("enter the number of terms");
     n = sdt.nextInt();
     for(i=1;i<=n;i++)
     {
       c= a+b;
       System.out.println(c);
       a=b;
       b=c;
     }
  }
}