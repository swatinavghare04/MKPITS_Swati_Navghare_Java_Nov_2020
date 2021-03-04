// program to fill the employee details

class Testemployee1
{
int empno;
String empname;
String designation;
float salary;

void getdata(int a,String b, String c,float d)
{
  empno = a;
  empname = b;
  designation = c;
  salary = d;
}
void showdata()
{

 System.out.println("---------employee Details---------");
 System.out.println("empno =" + empno);
 System.out.println("empname =" + empname);
 System.out.println("Designation =" + designation);
 System.out.println("Salary =" + salary);

}
}

class EmployeeDetails
{
  public static void main(String[] args)
   {
       Testemployee1 emp = new Testemployee1();
      emp.getdata(123,"sss","Manager",120000);
      emp.showdata();
}
}