// simple example of java nested try block.


class Excep6{

   public static void main(String[] args){

     try{

      try{

         System.out.println("going to divide");
         int b = 39/0;
      }
      catch(ArithmeticException e1){

         System.out.println(e1);
      }

      try{

         int a[] = new int[5];
         a[5] = 4;
      }
      catch(ArrayIndexOutOfBoundsException e1){

         System.out.println(e1);
      }

         System.out.println("other statement");
     }
     catch(Exception e1){

        System.out.println("Handeled");
     }

       System.out.println("normal flow...");
   }
}