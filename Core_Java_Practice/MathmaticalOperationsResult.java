// WAP to print on the output of adding, substracting, multiplying and dividing of two numbers which will be entered by the user.

import java.util.*;

class MathmaticalOperationsResult{

   public static void main(String[] args){

       int a,b;
       int add,sub,mul,div;

       Scanner scan = new Scanner(System.in);
       System.out.println("enter the two numbers for mathematical operation");
       a = scan.nextInt();
       b = scan.nextInt();
       add = a+b;
       sub = a-b;
       mul = a*b;
       div = a/b;

       System.out.println("Addition of two numbers = "+ add);
       System.out.println("Substraction of two numbers = "+ sub);
       System.out.println("Multiplication of two numbers = "+ mul);
       System.out.println("Division of two numbers = "+ div);
   }
}