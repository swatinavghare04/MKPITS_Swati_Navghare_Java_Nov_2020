//  Java finalize example.

import java.io.*;
class FinalizeExample{

  public void finalize(){

     System.out.println("Finalize called");
  }
}

class TestFinalize{

  public static void main(String[] args){

    FinalizeExample f1 = new FinalizeExample();
    FinalizeExample f2 = new FinalizeExample();
    f1 = null;
    f2 = null;
    System.gc();
  }
}