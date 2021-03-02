// program to fill the details of supplier;

class supplier
{
   String sup_id,sup_name,sup_addr,pname,pid;
   float cp;
    void getdata(String sid,String sname,String saddr,String pdn, String pdid,float cpr)
    {
      sup_id = sid;
      sup_name = sname;
      sup_addr = saddr;
      pname = pdn;
      pid = pdid;
      cp = cpr;
    }

   void showdata()
   {
    System.out.println("sup_id = "+ sup_id);
    System.out.println("sup_name = "+ sup_name);
    System.out.println("sup_addr = "+ sup_addr);
    System.out.println("pname = "+ pname);
    System.out.println("pid = "+ pid);
    System.out.println("cp = "+ cp);
   }
 }

 class SupplierDetails
 {
   public static void main(String[] args)
   {
     supplier sup = new supplier();
      sup.getdata("swati123","sonu","Amravati","watch","pdwt",500.0f);
      sup.showdata();
    }
 }