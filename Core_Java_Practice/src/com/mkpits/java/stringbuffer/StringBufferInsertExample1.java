// WAP for StringBuffer - insert() method -  input entered by the user.


import java.util.*;
class StringBufferInsertExample1 {

   public static void main(String[] args){

	   Scanner sc = new Scanner(System.in);
       System.out.println("enter your name");
       String a = sc.next();
       StringBuffer sb = new StringBuffer(a);
       System.out.println("enter your name");
       String b = sc.next();
       sb.insert(4,b);
       System.out.println(sb);
   }
}