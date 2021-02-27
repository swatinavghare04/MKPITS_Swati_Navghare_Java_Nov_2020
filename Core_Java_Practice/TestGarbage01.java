// WAP of garbage collection in java

public class TestGarbage01 {

  public void finalize(){

      System.out.println("object is garbage collected");
    }

    public static void main(String[] args){

     TestGarbage01 s1 = new TestGarbage01();
     TestGarbage01 s2 = new TestGarbage01();
     s1 = null;
     s2 =null;
     System.gc();
  }
}