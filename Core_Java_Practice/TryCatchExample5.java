// Example exception handling - to print a custom message on exception.

public class TryCatchExample5{

  public static void main(String[] args){

	  try{

           int data = 500/0;

        }
        catch(Exception e){

			  System.out.println("can't divide by zero");
			}
       }
   }