//wapin java to accept a number and print the table of that number, using for loop;

import java.util.*;
class tablefor
{
	public static void main(String[] args)
	{
int num,res,i;
Scanner s12 = new Scanner(System.in);
System.out.println("enter number");
num = s12.nextInt();
for(i=1;i<=10;i++)
{
res = num *i;
System.out.println(num + "*" + i + "=" +res);
}
}
}