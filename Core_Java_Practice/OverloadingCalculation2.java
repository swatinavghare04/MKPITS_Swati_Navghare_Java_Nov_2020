//method overloading with type promotion if matching found

class OverloadingCalculation2
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
  OverloadingCalculation2 obj = new OverloadingCalculation2();
  obj.sum(20,20);
 }
}