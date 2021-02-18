// WAP to create a thread by extending thread class 

class TestThreadEx1 extends Thread{
 public void run(){
  System.out.println("my thread is running");
  }
  
  public static void main(String[] args)
  {
   TestThreadEx1 th = new TestThreadEx1();
   th.start();
   }
  } 