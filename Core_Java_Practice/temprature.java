// wap in java to read the tempin centigrade and display a suitable message according to temp state below;

import java.util.*;
class temprature
{
public static void main(String[] args)
{
int temp;
Scanner te = new Scanner(System.in);
System.out.println("enter the temprature");
temp = te.nextInt();
if(temp<0)
{
	System.out.println("freezing weather");
	}
	else if(temp>=0 && temp<10)
	{
		System.out.println("very cold weather");
		}
		else if(temp>=10 && temp<20)
		{
			System.out.println("cold weather");
			}
			else if(temp>=20 && temp <30)
			{
				System.out.println("Normal in temprature");
				}
		else if(temp>=30 && temp <40)
		{
			System.out.println("It's hot");
			}
			else
			{
				System.out.println("it's very hot");
				}
}
}
