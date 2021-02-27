//wapin java to accept a number and print the tabl of that number, using while loop;

import java.util.*;
class table
{
	public static void main(String[] args)
	{
int num,res;
int i=1;
Scanner s12 = new Scanner(System.in);
System.out.println("enter number");
num = s12.nextInt();
while(i<=10)
{
res = num *i;
System.out.println(num + "*" + i + "=" +res);
i=i+1;
}
}
}