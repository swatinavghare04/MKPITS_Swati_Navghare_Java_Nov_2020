/* WAP in java to Create a class customer having fields custid,custname,address and emailid and getdata
method with 4 parameters and showdata method.  */

class Customer{

  int custid;
  String custname;
  String address;
  String emailid;


  void getdata(int cid,String cname,String cadd,String email){

     custid = cid;
     custname = cname;
     address = cadd;
     emailid = email;
  }

  void showdata(){

     System.out.println("Customer id =" + custid);
     System.out.println("Customer name =" + custname);
     System.out.println("Customer address =" + address);
     System.out.println("Customer email id =" + emailid);

  }
}

class TestCustomerclass{

   public static void main(String[] args){

     Customer C = new Customer();
     C.getdata(23,"Swati","Amravati","abc@gmail.com");
     C.showdata();
   }
}