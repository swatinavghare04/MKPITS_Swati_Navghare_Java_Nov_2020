// WAp in java to check whether a entered number is armstrong or not.

import java.util.*;
class TestArmstrangNumber{
  public static void main(String[] args){
       int a,sum=0,temp;
       System.out.println("Enter number to ckecked whether it is armstrong or not");
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       temp = n;
       while(n>0){

          a = n%10;
          sum = sum + (a*a*a);
          n = n/10;
       }
       if(temp==sum)
       System.out.println(temp + " Number is armstrong");
       else
       System.out.println(temp + " Number is not armstrong");
  }
}