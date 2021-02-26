// WAP for StringBuffer - replace() method

import java.util.*;
class StringBufferExample3{

   public static void main(String[] args){

	   Scanner sc = new Scanner(System.in);
       System.out.println("enter your name");
       String a = sc.next();
       StringBuffer sb = new StringBuffer(a);
       System.out.println("enter your name");
       String b = sc.next();
       sb.replace(1,4,b);
       System.out.println(sb);
   }
}