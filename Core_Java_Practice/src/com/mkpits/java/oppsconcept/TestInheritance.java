// WAP of Inheritance  -  use overrriding

import java.util.*;

class TestAccount1
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

class TestSaving extends TestAccount1
{
	int interest = 200;
	// overriding the account class dposite method
	void deposit(float amt)
	{
		balance = balance + amt + interest;
	}
}

class TestCurrent extends TestAccount1
{

}

 class TestInheritance
 {
   public static void main(String[] args)
   {
    TestAccount1 act = null;
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
     act = new TestSaving();
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
      act = new TestCurrent();
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