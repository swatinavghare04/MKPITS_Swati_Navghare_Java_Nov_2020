// Example of java if exception not occur.

import java.io.*;
class M{

   void Method()throws IOException{

     throw new IOException("device error");
   }
}

  public class TestThrows4{

   public static void main(String[] rags)throws IOException{

		  M a = new M();
		  a.Method();

     System.out.println("normal flow...");
   }
  }