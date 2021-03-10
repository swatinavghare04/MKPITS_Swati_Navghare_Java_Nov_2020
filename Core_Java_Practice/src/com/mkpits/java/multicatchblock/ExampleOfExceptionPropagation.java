// WAP in java to demonstrate Exception Propagation.

public class ExampleOfExceptionPropagation {

   void m(){

      int data = 50/0;
   }

  void n(){

     m();
  }

  void p(){

        n();
     }

   public static void main(String[] args){

       ExampleOfExceptionPropagation obj = new ExampleOfExceptionPropagation();
       try{

		     obj.p();
		  }
	catch(Exception e){

		   System.out.println("Exception Handled");
		}

		 System.out.println("normal flow...");
	 }
}