// WAP of java static nested class with static method.

class TestStaticNestedStaticMethod{

   static int data = 30;
   static class Inner{

      static void msg(){

            System.out.println("data is " + data);
      }
   }

      public static void main(String[] args){

          TestStaticNestedStaticMethod.Inner.msg();
      }`
}