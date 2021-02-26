// Example of java throws clause.

import java.io.IOException;
class TestThrows1{

   void m()throws IOException{

     throw new IOException("device error");   // checked exception
   }

   void n()throws IOException{

     m();
   }

   void p(){

   try{

     n();
   }
   catch(Exception e){

     System.out.println("exception handled");
   }
   }

   public static void main(String[] rags){

     TestThrows1 obj = new TestThrows1();
     obj.p();
     System.out.println("normal flow...");
   }
  }