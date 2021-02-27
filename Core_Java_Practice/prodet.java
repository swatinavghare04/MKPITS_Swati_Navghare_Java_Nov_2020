//java program to create class product

import java.util.*;
class product
{
  String pid;
  String pname;
  int p_qty;
  float sp;
  String batch_name;
  String mfg_dt;
  String expiry_dt;

void addproduct()
{
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter product ID");
	 int pid = sc1.nextInt();
    System.out.println("enter product name");
	String pname = sc1.next();
	System.out.println("enter product quantity");
	int p_qty = sc1.nextInt();
	System.out.println("enter product selling price");
	float sp = sc1.nextFloat();
	System.out.println("enter product batch name");
    String batch_name = sc1.next();
	System.out.println("enter product Manufacturing date");
	String mfg_dt = sc1.next();
	System.out.println("enter product expiry date");
    String expiry_dt = sc1.next();
    prg();
}

  void display()
  {
    System.out.println("-------Product Details---------");
    System.out.println("product ID = "+ pid);
    System.out.println("product name = "+ pname);
    System.out.println("product quantity = "+ p_qty);
    System.out.println("product selling price = "+ sp);
    System.out.println("product batch name = "+ batch_name);
    System.out.println("manufacturing date = "+ mfg_dt);
    System.out.println("expiry date = "+ expiry_dt);
     System.out.println("--------------------------------");
    prg();
  }


    void removeproduct()
    {
		pid =null;
		pname = null;
		p_qty = 0;
		sp = 0.0f;
		batch_name = null;
		mfg_dt=null;
		expiry_dt =null;
		prg();
 }

 void prg()
 {
	 int ch = 0;
	 System.out.println("enter choice 1 for add,2 for remove,3 for display,4 for exit");
	 Scanner sc1 = new Scanner(System.in);
	 ch = sc1.nextInt();
	 switch(ch)
	 {
		 case 1 : addproduct();
		         break;
		 case 2 : removeproduct();
		          break;
		 case 3 : display();
		         break;
		 case 4 : System.exit(0);
	               break;
	     default : System.out.println("Invalid");
                   break;
     }
  }
}
 class prodet
 {
   public static void main(String[] args)
    {

      product pd = new product(); // call blank constructor
      pd.prg();

    }
  }