//wap in java to accept  grade nd declare a equivalent description;- Greade description -- E-Excellent,V-very good,G-good,A-average,F-fail;

import java.util.*;
class grade
{
  public static void main(String[] args)
  {
     char ch;
     Scanner gd = new Scanner(System.in);
     System.out.println("Enter grade");
     ch = gd.next().charAt(0);
     switch(ch)
       {
         case 'E': System.out.println("Excellent");
                   break;
         case 'V': System.out.println("Very Good");
                   break;
         case 'G': System.out.println("Good");
                   break;
         case 'A': System.out.println("Average");
                   break;
         default: System.out.println("Excellent");
                   break;
      }
  }
}
