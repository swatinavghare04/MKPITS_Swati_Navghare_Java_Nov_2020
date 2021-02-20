// WAP to create an example of threadpriority

class TestThreadPriority extends Thread {

 public void run(){

  System.out.println("current thread name is :"+ Thread.currentThread().getName());
  System.out.println("current thread priority is :"+ Thread.currentThread().getPriority());

  }

  public static void main(String[] args){

   TestThreadPriority t1 = new TestThreadPriority();
   TestThreadPriority t2 = new TestThreadPriority();
   TestThreadPriority t3 = new TestThreadPriority();

   t1.setPriority(Thread.MIN_PRIORITY);
   t3.setPriority(Thread.MAX_PRIORITY);

   t1.start();
   t2.start();
   t3.start();

   }
  }

