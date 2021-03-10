// WAP in java to demonstrate example of java multi-catch block.

public class ExampleOfMultiCatchBlock {

  public static void main(String[] args){

    try{

        int a[] = new int[5];
        a[5] = 30/0;
    }
    catch(ArithmeticException e){

           System.out.println("task1 is completed");

		}

    catch(ArrayIndexOutOfBoundsException e1){

          System.out.println("task2 completed");
       }

    catch(Exception e){

		   System.out.println("common task completed");
		}

       System.out.println("rest of the code");
  }
}