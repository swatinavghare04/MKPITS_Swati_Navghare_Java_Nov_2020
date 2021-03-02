// wap in java to read roll no, name and marks of three subjects and calculate the total,percentage and division;

import java.util.*;

class StudentResultCalculation
{
public static void main(String[] args)
{
int rno,m1,m2,m3,total;
String name;
float division,per;
Scanner sdt = new Scanner(System.in);

System.out.println("enter roll nuber");
rno = sdt.nextInt();
System.out.println("enter name");
name = sdt.next();
System.out.println("enetr marks of three subjects");
m1 = sdt.nextInt();
m2 = sdt.nextInt();
m3 = sdt.nextInt();
total = m1+m2+m3;
division = total/300.0f;
per  = division*100.0f;
System.out.println("Total = " +total);
System.out.println("Division = " +division);
System.out.println("percent = " +per);
}
}