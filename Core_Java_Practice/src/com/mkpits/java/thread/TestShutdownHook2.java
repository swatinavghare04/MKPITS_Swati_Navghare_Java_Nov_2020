// example of shutdown hook by annonymous class.

public class TestShutdownHook2{

  public static void main(String[] args)throws Exception{

     Runtime r = Runtime.getRuntime();
      r.addShutdownHook(new Thread(){

        public void run(){

           System.out.println("Shutdown Hook completed..");
        }
      }
      );

      System.out.println("Now main sleeping...press ctrl+c to exit");

      try{
            Thread.sleep(3000);
      }catch(Exception e){}
  }
}