// The Account class

class Account
{
 int id;
 String name;
 int balance;
 int amount;
 int account;

 Account()
 {
  id = 123;
  name = "Swati";
  balance = 2000;
  amount = 1000;
 }

  Account(int ID,String Name)
 {
   id = ID;
   name = Name;
 }

 Account(int ID,String Name,int Balance)
 {
   id = ID;
   name = Name;
   balance = Balance;
 }

 public int getID()
 {
  return id;
 }

public String getName()
{
 return name;
}

public int getBalance()
{
 return balance;
}

public int credit()
{

 balance =amount+balance;
 return balance;

}

public int debit()
{
 if (amount<=balance)
 balance = balance - amount;
 else
 System.out.println("emount exceeded");
 return balance;
}

public int transferTo()
{
 if (amount<=balance)
  account = amount;
  else
  System.out.println("emount exceeded");
 return balance;
}
}

class TestAccount
{
  public static void main(String[] args)
  {
    Account acc = new Account();
    System.out.println("Id = " + acc.getID()+ "," + "Name = " + acc.getName() + "," + "Balance = " + acc.getBalance() + "," + "Credit = " + acc.credit() + ","+ "Debit =" + acc.debit() + "," + "Transfer to = " + acc.transferTo());
   }
 }