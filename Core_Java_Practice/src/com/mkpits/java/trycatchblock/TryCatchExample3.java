// Example exception handling - kept the code in try block that will not throw an exception.

public class TryCatchExample3{

  public static void main(String[] args){

	  try{

           int data = 500/0;
           System.out.println("rest of the code");
        }
        catch(ArithmeticException e){

			  System.out.println(e);
			}
       }
   }