// exception handlimg example to handle another unchecked exception

public class TryCatchExceptionex10{

 public static void main(String[] args){

  try{

    int arr[] ={1,3,4,5};  // may throe exception
    System.out.println(arr[10]);
  }
  catch(ArrayIndexOutOfBoundsException e){

	  // try to handle Arithmatic Exception using ArrayIndexOutOfBoundsException
	 System.out.println(e);
  }
   System.out.println("rest of the code...");
 }
}