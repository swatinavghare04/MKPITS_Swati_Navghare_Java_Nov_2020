// Program which describes that checked exceptions are not propagated.

public class MultipleCatchBlock3{

   void m(){

	   throw new java.io.IOException("device error"); //checked exception
   }

  void n(){

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

   public static void main(String[] args){

       MultipleCatchBlock2 obj = new MultipleCatchBlock2();
		  obj.p();

		 System.out.println("normal flow...");
	 }
}