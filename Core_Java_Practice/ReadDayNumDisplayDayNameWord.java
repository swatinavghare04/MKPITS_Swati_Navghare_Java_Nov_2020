// wap in java to read any day number in integer and display day name in the word;

import java.util.*;
class daynum
{
   public static void main(String[] args)
   {
       int day_num;
       Scanner dn = new Scanner(System.in);
       System.out.println("enter day number");
       day_num = dn.nextInt();
       switch(day_num)
        {
          case 1: System.out.println("Sunday");
                  break;
          case 2: System.out.println("Monday");
                  break;
          case 3: System.out.println("Tueday");
                  break;
          case 4: System.out.println("Wednesday");
                  break;
          case 5: System.out.println("Thursday");
                  break;
          case 6: System.out.println("Friday");
                  break;
          case 7: System.out.println("Saturday");
                  break; 
          default : System.out.println("Invalid");
                    break;        
        }
    }    
}