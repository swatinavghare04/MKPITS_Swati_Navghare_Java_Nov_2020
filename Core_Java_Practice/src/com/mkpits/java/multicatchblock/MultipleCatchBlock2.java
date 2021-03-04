// Program of Exception Propagation.

public class MultipleCatchBlock2{

   void m(){

	   try{

         int data = 50/0;
      }
      catch(Exception e){

		   System.out.println("exception handled");
		}
   }

  void n(){

     m();
  }

  void p(){

        n();
     }

   public static void main(String[] args){

       MultipleCatchBlock2 obj = new MultipleCatchBlock2();
       try{

		     obj.p();
		  }
	catch(Exception e){

		   System.out.println("Exception Handled");
		}

		 System.out.println("normal flow...");
	 }
}