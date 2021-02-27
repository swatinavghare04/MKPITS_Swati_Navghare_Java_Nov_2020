// wap in java to calculate and print the electricity bill of a given customer;

import java.util.*;
class elect
{
  public static void main(String[] args)
   {
    int cust_id,unitcons;
    String name;
    float total_amnt;
    Scanner ect = new Scanner(System.in);
    System.out.println("enter the customer id");
    cust_id = ect.nextInt();
    System.out.println("enter the name of the customer");
    name = ect.next();
    System.out.println("enter the unit consumed by the customer");
    unitcons = ect.nextInt();
    if(unitcons<=199)
    total_amnt = unitcons*1.20f;
    else if(unitcons>=200 && unitcons<400)
    total_amnt = unitcons*1.50f;
    else if(unitcons>=400 && unitcons<600)
    total_amnt = unitcons*1.80f;
    else
    total_amnt = unitcons*2;
    total_amnt = total_amnt +(0.15f*total_amnt);
    total_amnt = total_amnt + 100;
    System.out.println("total amount = "+ total_amnt);

    }
 }


