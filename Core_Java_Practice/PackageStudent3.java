package com.mk;

public class PackageStudent3
{
 private float roi;
// setter method 
public void setName(float roi)
{
 this.roi=roi;
}
public float calinterest(float pa,int noy)
{
 float pi = (pa*roi*noy)/100.0f;
return pi;
}
}