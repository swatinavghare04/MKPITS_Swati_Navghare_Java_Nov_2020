// WAP to create thread two thread.

class TestThreadEx3 implements Runnable{
    public void run(){
	 for(int i=1;i<10;i++){
    System.out.println("my thread is running" + i);
   }
}

  public static void main(String[] args)
  {
    TestThreadEx2 th1 = new TestThreadEx2();
    Thread t = new Thread(th1);
    t.start();
    Thread t1 = new Thread(th1);
    t1.start();
  }
 }