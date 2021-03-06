// WAP in java for  static nested class with instance method.

class TestStaticNestedClass{

   static int data = 30;
   static class Inner{
   
      void msg(){
            
            System.out.println("data is " + data);
      }
   }
      
      public static void main(String[] args){

          TestStaticNestedClass.Inner obj = new TestStaticNestedClass.Inner();
            obj.msg();
      }
}