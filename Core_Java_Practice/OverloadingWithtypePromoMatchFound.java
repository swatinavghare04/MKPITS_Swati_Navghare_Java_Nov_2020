// method overloading with the type promotion when matching found

class OverloadingWithtypePromoMatchFound
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
  OverloadingWithtypePromoMatchFound obj = new OverloadingWithtypePromoMatchFound();
  obj.sum(20,20); // now second int literal will be promoted to long

 }
}

