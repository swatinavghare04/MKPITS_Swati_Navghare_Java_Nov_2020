package bank;
public class TestPackageAccount
{
 int bal = 1000; // default access modifier
 public String deposit(int amt)
 {
	  bal = bal+amt;
     return "amount deposited, bal is " + bal;
}
}