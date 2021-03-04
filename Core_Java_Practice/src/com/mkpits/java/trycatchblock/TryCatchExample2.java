// Example exception handling -  use try-catch block.

public class TryCatchExample2{

  public static void main(String[] args){

	  try{

           int data = 500/0;
        }
        catch(ArithmeticException e){

			  System.out.println(e);
			}
     System.out.println("rest of the code");
  }
}