// WAP for StringBuffer - delete() method

import java.util.*;
class StringBufferDeleteExample {

   public static void main(String[] args){

	   Scanner sc = new Scanner(System.in);
       System.out.println("enter your name");
       String a = sc.next();
       StringBuffer sb = new StringBuffer(a);
       System.out.println("enter your name");
       String b = sc.next();
       sb.delete(1,3);
       System.out.println(sb);
   }
}