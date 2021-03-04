/* Example of java multi-catch block - try block contain two exception but at a time only one exception occures
and corresponding catch block n invoked*/

public class MultiCatchBlock3{

  public static void main(String[] args){

    try{

        int a[] =new int[5];
        a[5] = 300/0;
        System.out.println(a[10]);
    }
    catch(ArithmeticException e){

       System.out.println("Arithmetic Exception occurs");
    }
    catch(ArrayIndexOutOfBoundsException e){

       System.out.println("ArrayIndexOutOfBounds Exception occurs");
    }
    catch(Exception e){

        System.out.println("Parent Exception occurs");
    }

       System.out.println("rest of the code");
  }
}