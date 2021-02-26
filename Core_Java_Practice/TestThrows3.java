// Example of java if exception not occur.

import java.io.*;
class M{

   void Method()throws IOException{

     System.out.println("device operation performed");
   }
}

  public class TestThrows3{

   public static void main(String[] rags)throws IOException{

		  M a = new M();
		  a.Method();

     System.out.println("normal flow...");
   }
  }