// Example of java if exception not occur.

import java.io.*;
class TestM1{

   void Method()throws IOException{

     throw new IOException("device error");
   }
}

  public class TestThrows4{

   public static void main(String[] rags)throws IOException{

       TestM1 a = new TestM1();
		  a.Method();

     System.out.println("normal flow...");
   }
  }