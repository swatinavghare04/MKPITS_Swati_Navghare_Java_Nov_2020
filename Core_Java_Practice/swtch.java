// wap in java to chck whether an alphabate is a vowel or consonant;

import java.util.*;
class swtch
{
  public static void main(String[] args)
  {
     char ch;
     System.out.println("enter alphabate");
     Scanner sct = new Scanner(System.in);
     ch = sct.next().charAt(0);
     switch(ch)
     {
        case 'a','e','i','o','u':
        System.out.println("enter alphabate is vowel");
         break;
        default :
        System.out.println("enter alphabate is consonent");
         break;
     }
   }
 }