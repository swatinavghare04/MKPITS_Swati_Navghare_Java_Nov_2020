// WAP of garbage collection in java

public class TestGarbageCollection01 {

  public void finalize(){

      System.out.println("object is garbage collected");
    }

    public static void main(String[] args){

        TestGarbageCollection01 s1 = new TestGarbageCollection01();
        TestGarbageCollection01 s2 = new TestGarbageCollection01();
     s1 = null;
     s2 =null;
     System.gc();
  }
}