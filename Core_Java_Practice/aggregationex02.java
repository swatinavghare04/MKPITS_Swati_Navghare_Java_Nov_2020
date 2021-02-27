// Example of Aggregation

class Address
{
  String city;
  String state;
  int pincode;
}
class Employee
{
 int empno;
 String empname;
 Address address;
 void getdata(int empno,String empname,Address address)
 {
  this.empno = empno;
  this.empname = empname;
  this.address = address;
 }
 void showdata()
 {
  System.out.println("empno = " + empno);
  System.out.println("empname = " + empname);
  System.out.println("city = " + address.city);
  System.out.println("state = " + address.state);
  System.out.println("pincode = " + address.pincode);
 }
}

class aggregationex02
{
 public static void main(String[] args)
 {
  Employee emp = new Employee();
  Address adr = new Address();
 adr.city = "Nagpur";
 adr.state = "Maharashtra";
 adr.pincode = 4444;
 emp.getdata(11,"swati",adr);
 emp.showdata();
 }
}