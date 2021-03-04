// Write a java program that takes an age (for example 20) as input and prints something as "You look older than 20".

import java.util.*;

class TakeAgePrintMessage{

   public static void main(String[] args){

      int age;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter age");
      age = sc.nextInt();

      if(age>=10 && age<=20){

      System.out.println("You are in younger age");

     }
       else if(age>=21 && age<=30){

      System.out.println("You are in middle age");

      }
       else {

      System.out.println("You look older than 30");

      }
   }
}