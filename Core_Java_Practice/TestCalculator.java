// calculator

import java.util.*;
class Calculator
{
  int num1,num2,res = 0;
  double addition(int n1,int n2)
  {
    return n1+n2;
  }
  double substraction(int n1,int n2)
    {
      return n1-n2;
  }
  double multiplication(int n1,int n2)
    {
      return n1*n2;
  }
  double division(int n1,int n2)
    {
      return n1/n2;
  }
 double square(int n1)
    {
      return n1*n1;
  }
 /* void addition(int n1,int n2)
    {
      return n1+n2;
  }
 void percent(int n1,int n2)
  {
    return n1%n2;
  }*/
 }

 class TestCalculator
 {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("My Calculator");
    System.out.println("enter first number");
    int num1 = scan.nextInt();
    System.out.println("enter second number");
    int num2 = scan.nextInt();
    double res = 0;
    Calculator cal= new Calculator();
    System.out.println("enter your choice : \n 1: addition \n 2: substraction \n 3: multiplication \n 4 : division \n 5: square");
    int ch = scan.nextInt();

    switch(ch)
    {
		case 1 : res = cal.addition(num1,num2);
		          break;
	    case 2 : res = cal.substraction(num1,num2);
		          break;
		case 3 : res = cal.multiplication(num1,num2);
		          break;
		case 4 : res = cal.division(num1,num2);
		          break;
	    case 5 : res = cal.square(num1);
		          break;
	    default : System.out.println("Invalid choice");
	               break;
	}
	System.out.println("Result = " + res);
  }
}
