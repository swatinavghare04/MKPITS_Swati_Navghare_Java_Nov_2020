//default access modifiers

package bank;
public class Account
{
 int bal = 1000; // default access modifier
 public String deposit(int amt)
 {
	  bal = bal+amt;
     return "amount deposited, bal is " + bal;
}
}

import bank.Account;
import java.util.*;
class TestDefaultAccessModifiers
{
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter amount to deposit");
	  int amount = nextInt();
	  Account act = new Account();
	  // act.bal = 500; since bal is default
	  String str = act.deposit(amount);
	  System.out.println(str);
   }
}
