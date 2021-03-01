// example on cloneable


class emp implements Cloneable
{
 int empno;
 String empname;
 emp(int empno, String empname)
 {
  this.empno =empno;
  this.empname = empname;
 }
 public Object clone() throws CloneNotSupportedException
 {
  return super.clone();
 }
  public static void main(String[] args)
  {
   try
   {
    emp e1 = new emp(123,"Sonu");
    emp e2 = (emp)e1.clone();

    System.out.println(e1.empno+" " + e1.empname);
     System.out.println(e2.empno+" " + e2.empname);
   }
   catch(CloneNotSupportedException ex)
   {
     System.out.println(ex.toString());
   }
  }
}