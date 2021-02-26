// Example of java throws when we handle the exception..

import java.io.*;
class M{

   void Method()throws IOException{

     throw new IOException("device error");
   }
}

  public class TestThrows2{

   public static void main(String[] rags){

     try{
		  M a = new M();
		  a.Method();
	   }
	  catch(Exception e){

		    System.out.println("exception handled");
		}
     System.out.println("normal flow...");
   }
  }