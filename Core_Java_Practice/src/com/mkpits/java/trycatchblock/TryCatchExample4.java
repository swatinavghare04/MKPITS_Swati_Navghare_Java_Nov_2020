// Example exception handling - using parent class exception.

public class TryCatchExample4{

  public static void main(String[] args){

	  try{

           int data = 500/0;

        }
        catch(Exception e){

			  System.out.println(e);
			}

			System.out.println("rest of the code");
       }
   }