// write a program in java by using abstract class and abstract method.

import java.util.*;

abstract class Account
{
 int actno;
 float balance = 1000;
 String str = "";

 abstract void deposit(float amt);

 abstract void withdrawl(float amt);

 String showbalance()
 {
  str = "act no" + actno + "balance is " + balance;
  return str;
 }
}

class Saving extends Account
{
	int interest = 200;
	// overriding the account class deposite method
	void deposit(float amt)
	{
		balance = balance + amt + interest;
	}
void withdrawl(float amt)
	{
		balance = balance - amt;
	}
}

class Current extends Account
{
	void deposit(float amt)
		{
			balance = balance + amt ;
		}
	void withdrawl(float amt)
		{
			balance = balance - amt;
	}

}

 class TestAbstractionAccount
 {
   public static void main(String[] args)
   {
	   Account act = null;
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
     act = new Saving();
     act.actno = ano;
     if(tran.equals("deposite"))
     {
      act.deposit(amt);
     }
     else if(tran.equals("withdrawl"))
     {
      act.withdrawl(amt);
     }
     result = act.showbalance();
    }
     else if(acttype.equals("Current"))
     {
      act = new Current();
      act.actno = ano;
     if(tran.equals("deposite"))
     {
      act.deposit(amt);
     }
     else if(tran.equals("withdrawl"))
     {
      act.withdrawl(amt);
     }
     result = act.showbalance();
    }
    else
    {
    System.out.println("Invalid inputs");
    }
    System.out.println(result);
    }
    }