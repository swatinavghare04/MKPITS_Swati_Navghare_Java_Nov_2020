import bank.Account;
import java.util.*;
class testbank1
{
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter amount to deposit");
	  int amount = scan.nextInt();
	  Account act = new Account();
	  // act.bal = 500; since bal is default
	  String str = act.deposit(amount);
	  System.out.println(str);
   }
}	