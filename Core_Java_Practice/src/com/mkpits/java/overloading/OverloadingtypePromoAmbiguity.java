// method overloading with the type promotion in case of ambiguity

class OverloadingtypePromoAmbiguity
{
 void sum(int a,long b)
 {
  System.out.println("a method invoked");
 }
 void sum(long a,int b)
 {
   System.out.println("b method invoked");
 }

 public static void main(String[] args)
 {
  OverloadingtypePromoAmbiguity obj = new OverloadingtypePromoAmbiguity();
  obj.sum(20,20L);
  obj.sum(20L,20);
 }
}

