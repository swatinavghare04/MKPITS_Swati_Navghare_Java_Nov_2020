// wap in java to accept a number and print from 1 to the number entered by the user using do while loop, then ask to user whether to accept another number or not;

import java.util.*;
class swchwhlp
{
public static void main(String[] args)
{
int num,i=1;
char ch;
System.out.println("enter the number from the keyboard");
Scanner sc= new Scanner(System.in);
num = sc.nextInt();
System.out.println("The numbers are");
do
{
System.out.println(i);
i++;
}
while(i<=num);
System.out.println("Whether accept another number");
ch = sc.next().charAt(0);
switch(ch)
{
	case 'Y':int j=1;
	       System.out.println("enter the number from the keyboard");
		   num = sc.nextInt();
		   System.out.println("The numbers are");
		   do
		   {
		   System.out.println(j);
		   j++;
		   }
while(j<=num);

break;

case 'N':
default :System.out.println("Program end");
break;
	}
}
}

