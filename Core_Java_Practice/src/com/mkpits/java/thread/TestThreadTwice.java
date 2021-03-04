// WAP to start the same thread twice

class TestThreadTwice extends Thread{
      public void run(){
      System.out.println("thread is running");
    }
    
   public static void main(String[] args)
   {
     TestThreadTwice t= new TestThreadTwice();
      t.start();
      t.start();
   }
 }  
    