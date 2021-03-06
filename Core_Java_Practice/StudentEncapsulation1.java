// WAP in java to demonstrate encapsulation with the help of getter and setter method.

package com.mk;

public class StudentEncapsulation1{

  private float roi;
  
  public void setName(float roi){
  
     this.roi = roi;
  }
  
  public float calinterest(float pa,int nom){
     
     float pi = pa*roi*nom;
     return pi;
  }
}