// wap in java to accept a number and print from 1 to the number entered by the user using do while loop, then ask to user whether to accept another number or not;

import java.util.*;
class PrintNumOnetoUserEnteredusedowhile
{
public static void main(String[] args)
{
int num,i=1;
char ch = 'Y';
do
{
System.out.println("enter the number from the keyboard");
Scanner sc= new Scanner(System.in);
num = sc.nextInt();
System.out.println("The numbers are");
i=1;
do
{
System.out.println(i);
i++;
}
while(i<=num);
System.out.println("do you want to continue,if yes press Y");
ch = sc.next().charAt(0);
}
while(ch=='Y');
System.out.println("Thank you");
}
}
