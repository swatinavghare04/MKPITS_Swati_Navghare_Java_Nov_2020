// WAP in java to demonstrate simple example of java multi-catch block- assign null value to String variable

public class ExOfMultiCatchBlockAssignNullValueToVariable {

  public static void main(String[] args){

    try{

        String s = null;
        System.out.println(s.length());
    }
    catch(ArithmeticException e){

           System.out.println("Arithmetic Exception occurs");

		}

    catch(ArrayIndexOutOfBoundsException e1){

          System.out.println("ArrayIndexOutOfBounds Exception occurs");
       }

    catch(Exception e){

		   System.out.println("Parent Exception occurs");
		}

       System.out.println("rest of the code");
  }
}