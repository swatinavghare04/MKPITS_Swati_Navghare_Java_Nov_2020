// wap in java to accept the height of a person in centimeter and categories the person according to their height.

import java.util.*;

class CategoriesPersonAccToHeight
{
public static void main(String[] args)
{

System.out.println("enetr height of the person");
Scanner sc = new Scanner(System.in);
int ht= sc.nextInt();

if(ht<150)
{
System.out.println("ht of the person is small");
}
else if(ht>150 && ht<180)
{
System.out.println("ht of the person is n middle range");
}
else
{
System.out.println("person is tall");
}
}
}