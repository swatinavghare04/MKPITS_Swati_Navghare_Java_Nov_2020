//wapin java to accept 5 numbers using for loop and print the sum of 5 no;

import java.util.*;
class forsum
{
	public static void main(String[] args)
	{
int num,sum=0;
int i;
Scanner s12 = new Scanner(System.in);
System.out.println("enter number");
num = s12.nextInt();
for(i=1;i<=num;i++)
{
sum = sum +i;
}
System.out.println("sum = " +sum);
}
}