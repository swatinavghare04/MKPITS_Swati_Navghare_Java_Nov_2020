// WAP in java for encapsulation that has only four fields with its setter and getter methods.

package com.mk;

public class TestAccountEncapsulation{

   public static void main(String[] args){

      AccountEncapsulation acc = new AccountEncapsulation();

      acc.setAcc_no(7560504000L);
      acc.setName("Sonal");
      acc.setEmail("sonalabcz@mk.com");
      System.out.println(acc.getAcc_no() + "" + acc.getName() + "" + acc.getEmail());
   }
}