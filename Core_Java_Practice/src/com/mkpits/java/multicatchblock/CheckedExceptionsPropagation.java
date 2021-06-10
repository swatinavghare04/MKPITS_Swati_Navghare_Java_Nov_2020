// WAP in java which describes that checked exceptions are propagated.

public class CheckedExceptionsPropagation {

   void m(){

	   try{

	   throw new java.io.IOException("device error"); //checked exception
     }
    catch(Exception ee){

		System.out.println(ee);
	}
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

       CheckedExceptionsPropagation obj = new CheckedExceptionsPropagation();
		  obj.p();

		 System.out.println("normal flow...");
	 }
}