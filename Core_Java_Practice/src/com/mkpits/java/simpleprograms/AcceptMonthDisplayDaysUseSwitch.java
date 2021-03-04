// WAP to accept month and display the days in that month using switch.

import java.util.*;
class AcceptMonthDisplayDaysUseSwitch
{
public static void main(String[] args)
{
String month;
int days=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the month name");
month = s.next();
switch(month)
{
case "January":
case "March":
case "May":
case "July":
case "August":
case "October":
case "December":
days =31;
break;
case "Febuary":
days = 29;
break;
case "April":
case "June":
case "September":
case "November":
days =30;
break;
default :
System.out.println("Invalid");
break;
}
System.out.println("Days ="+days);
}
}
