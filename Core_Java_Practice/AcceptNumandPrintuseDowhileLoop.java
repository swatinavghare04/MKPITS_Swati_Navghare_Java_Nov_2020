// wap in java to accept a number and print from 1 to the number entered by the user using do while loop;

import java.util.*;
class AcceptNumandPrintuseDowhileLoop
{
public static void main(String[] args)
{
int num,i=1;
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
}
}

