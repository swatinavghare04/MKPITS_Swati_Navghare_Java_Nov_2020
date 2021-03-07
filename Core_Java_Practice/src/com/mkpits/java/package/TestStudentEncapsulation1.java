// WAP in java to demonstrate encapsulation with the help of getter and setter method.

package com.mk;

class TestStudentEncapsulation1{

   public static void main(String[] args){

      StudentEncapsulation1 se1 = new StudentEncapsulation1();
      se1.setName(12.3f);
      float res = se1.calinterest(20000,12);
      //System.out.println(se1.getName());
      System.out.println("Simple Interest = " + res);
   }
}