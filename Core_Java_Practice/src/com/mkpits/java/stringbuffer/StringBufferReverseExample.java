// WAP for StringBuffer - reverse() method

import java.util.*;
class StringBufferReverseExample {

   public static void main(String[] args){

          String str = "";
          String str1 = "";
	   Scanner sc = new Scanner(System.in);
       System.out.println("enter your name");
       String a = sc.next();
       StringBuffer sb = new StringBuffer(a);
       str = sb.toString();
       sb.reverse();
       str1 = sb.toString();
       System.out.println( str);
       System.out.println(str1);
       if(str.equals(str1))
       System.out.println("String is palendrome");
       else
       System.out.println("String is not palendrome");
   }
}