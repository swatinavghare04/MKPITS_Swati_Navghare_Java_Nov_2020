// wap in java to read any month number in integer and display the number of days for this month;

import java.util.*;
class ReadMonthNumDisplayDays
{
   public static void main(String[] args)
   {
       int month_day;
       Scanner mnthno = new Scanner(System.in);
       System.out.println("enter day number");
       month_day = mnthno.nextInt();
       switch(month_day)
        {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
          month_day = 31;
          System.out.println("number of days = " +month_day);
                   break;
          case 2: month_day = 29;
          System.out.println("number of days = " +month_day);
                  break;
          case 4:
          case 6:
          case 9:
          case 11:
          month_day = 30;
        System.out.println("number of days = " +month_day);
                  break;
          default : System.out.println("Invalid");
                    break;
        }
    }
}