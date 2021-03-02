// to fill the data of stock

import java.util.*;
class stock
{
  int pid,sid,stk_disc,stk_qty;
  String date;

   public stock()
  {
    pid = 123;
    sid = 143;
    stk_disc = 10;
    stk_qty = 5;
    date = "12/02/2015";
  }

  public stock(int prodid, int stkid,int stkdisc,int stkqty,String dt)
  {
    pid = prodid;
    sid = stkid;
    stk_disc = stkdisc;
    stk_qty = stkqty;
    date = dt;

  }

  void showstock()
  {
    System.out.println("-------Stock Details-------------");
    System.out.println("product id = "+ pid);
    System.out.println("stock id = "+ sid);
    System.out.println("stock disc = "+ stk_disc);
    System.out.println("stock quantity = "+ stk_qty);
    System.out.println("Date = "+ date);
    System.out.println("----------------------------------");
  }

 }

 class StockDetails
 {
   public static void main(String[] args)
    {
	  Scanner stk1 = new Scanner(System.in);
      stock sd = new stock(); // call blank constructor
      sd.showstock();

      System.out.println("enter product id");
      int proid = stk1.nextInt();
      System.out.println("enter stock id");
      int stockid = stk1.nextInt();
      System.out.println("enter stock discount");
      int stock_disc = stk1.nextInt();
      System.out.println("enter stock quantity");
      int stock_qty = stk1.nextInt();
      System.out.println("enter date");
      String dte= stk1.next();
      System.out.println("----------------------------");

      stock sd1 = new stock(proid,stockid,stock_disc,stock_qty,dte);
      sd1.showstock();
    }
  }