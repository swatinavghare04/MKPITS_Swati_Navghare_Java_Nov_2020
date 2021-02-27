// method overloading with the type promotion when matching found

class OverloadingCalculation1
{
 void sum(int a,int b)
 {
  System.out.println("int arg method invoked");
 }
 void sum(long a,long b)
 {
   System.out.println("long arg method invoked");
 }

 public static void main(String[] args)
 {
  OverloadingCalculation obj = new OverloadingCalculation();
  obj.sum(20,20); // now second int literal will be promoted to long

 }
}

