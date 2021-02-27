// program to fill the employee details
class employee
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

class sample
{
  public static void main(String[] args)
   {
     employee emp = new employee();
      emp.getdata(123,"sss","Manager",120000);
      emp.showdata();
}
}