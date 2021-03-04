// WAP to create thread by implementing runnable interface.

class TestThreadEx2 implements Runnable{
    public void run(){
    System.out.println("my thread is running");
  }

  public static void main(String[] args)
  {
    TestThreadEx2 th1 = new TestThreadEx2();
    Thread t = new Thread(th1);
    t.start();
  }
 }