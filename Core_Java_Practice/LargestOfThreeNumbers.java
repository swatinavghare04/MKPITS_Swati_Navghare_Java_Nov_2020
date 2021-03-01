// wap in java to find the largest of three numbers;

import java.util.*;

class large
{
public static void main(String[] args)
{
int a,b,c;
System.out.println("enetr three values");
Scanner scan = new Scanner(System.in);
a = scan.nextInt();
b = scan.nextInt();
c = scan.nextInt();
if(a>b && a>c)
{
System.out.println("a is greater ");
}
else if(b>c && b>a)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}