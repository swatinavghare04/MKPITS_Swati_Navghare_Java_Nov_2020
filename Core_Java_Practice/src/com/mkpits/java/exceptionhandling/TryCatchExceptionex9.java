// exception handlimg example to handle another checked exception

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExceptionex9{

 public static void main(String[] args){

	 PrintWriter PW;
  try{

   PW = new PrintWriter("jtp.txt");
    PW.println("Saved");
  }
  // providing the checked exception handler
  catch(FileNotFoundException e){

	  // try to handle Arithmatic Exception using ArrayIndexOutOfBoundsException
	 System.out.println(e);
  }
   System.out.println("File Saved Successfully");
 }
}