// WAP in java for encapsulation that has only four fields with its setter and getter methods.

package com.mk;

public class AccountEncapsulation{

    private long acc_no;
    private String name, email;
    private float amount;

    public long getAcc_no(){

       return acc_no;
    }

     public void setAcc_no(long acc_no){

       this.acc_no = acc_no;
     }

     public String getName(){

        return name;
     }

     public void setName(String name){

       this.name = name;
     }

      public String getEmail(){

	         return email;
	      }

	  public void setEmail(String email){

	        this.email = email;
     }

}