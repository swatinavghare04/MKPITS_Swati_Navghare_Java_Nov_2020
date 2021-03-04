package com.mkpits.java.oppsconcept;// WAP in java - how to use Inheritance in java

import java.util.*;

class Account
{
 int actno;
 float balance = 1000;
 String str = "";

 void deposit(float amt)
 {
  balance = balance +amt;
 }
 void withdrawl(float amt)
 {
  balance = balance - amt;
 }
 String showbalance()
 {
  str = "act no" + actno + "balance is " + balance;
  return str;
 }
}

class Saving extends Account
{
	int interest = 200;
	// overriding the account class dposite method
	void deposit(float amt)
	{
		balance = balance + amt + interest;
	}
}

class Current extends Account
{

}

 class TestAccountInheritance
 {
   public static void main(String[] args)
   {
    Scanner s1 = new Scanner(System.in);
    System.out.println("enter Account no");
    int ano = s1.nextInt();
    System.out.println("enter amount");
    float amt  = s1.nextFloat();
    System.out.println("enter account type(Saving or Current)");
    String acttype = s1.next();
    System.out.println("enter deposite or withdrawl");
    String tran = s1.next();
    String result = "";
    if(acttype.equals("Saving"))
    {
     Saving S = new Saving();
     S.actno = ano;
     if(tran.equals("deposite"))
     {
      S.deposit(amt);
     }
     else if(tran.equals("withdrawl"))
     {
      S.withdrawl(amt);
     }
     result = S.showbalance();
    }
     else if(acttype.equals("Current"))
     {
      Current S = new Current();
      S.actno = ano;
     if(tran.equals("deposite"))
     {
      S.deposit(amt);
     }
     else if(tran.equals("withdrawl"))
     {
      S.withdrawl(amt);
     }
     result = S.showbalance();
    }
    else
    {
    System.out.println("Invalid inputs");
    }
    System.out.println(result);
    }
    }