// WAP in java to demonstrate Exception Propagation using try-catch block.

public class ExampleOfExceptionPropagationUseTryCatch {

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

       ExampleOfExceptionPropagationUseTryCatch obj = new ExampleOfExceptionPropagationUseTryCatch();
       try{

		     obj.p();
		  }
	catch(Exception e){

		   System.out.println("Exception Handled");
		}

		 System.out.println("normal flow...");
	 }
}