// WAP on making user thread  as daemon after starting the user thread.

class TestDaemonThread2 extends Thread {

 public void run(){

     System.out.println("Name :" + Thread.currentThread().getName());
     System.out.println("Daemon :" + Thread.currentThread().isDaemon());
  }

  public static void main(String[] args){

   TestDaemonThread t1 = new TestDaemonThread();
   TestDaemonThread t2 = new TestDaemonThread();
   TestDaemonThread t3 = new TestDaemonThread();

   t1.start();
   t1.setDaemon(true);

   t2.start();
   t3.start();

   }
  }

