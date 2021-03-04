// Example of java throws when we handle the exception..

import java.io.*;
class TestM{

   void Method()throws IOException{

     throw new IOException("device error");
   }
}

  public class TestThrows2{

   public static void main(String[] rags){

     try{
         TestM a = new TestM();
		  a.Method();
	   }
	  catch(Exception e){

		    System.out.println("exception handled");
		}
     System.out.println("normal flow...");
   }
  }