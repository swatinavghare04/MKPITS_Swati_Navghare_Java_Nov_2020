// WAP of garbage collection in java

public class TestGarbageCollection {

  public void finalize(){

      System.out.println("object is garbage collected");
    }

    public static void main(String[] args){

        TestGarbageCollection s1 = new TestGarbageCollection();
        TestGarbageCollection s2 = new TestGarbageCollection();
     s1 = null;
     s2 =null;
     System.gc();
  }
}