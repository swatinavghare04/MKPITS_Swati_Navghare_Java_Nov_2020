// Program which describes that checked exceptions are not propagated.

public class MultipleCatchBlock4{

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

       MultipleCatchBlock2 obj = new MultipleCatchBlock2();
		  obj.p();

		 System.out.println("normal flow...");
	 }
}