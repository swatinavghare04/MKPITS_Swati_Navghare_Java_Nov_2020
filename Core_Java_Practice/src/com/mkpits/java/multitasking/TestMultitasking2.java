// Program of performing single task by multiple threads -  Runnable interface.

class TestMultitasking2 implements Runnable{

   public void run(){

   System.out.println("task one");
   }

  public static void main(String[] args){

       Thread t1 = new Thread(new TestMultitasking2());
       Thread t2 = new Thread(new TestMultitasking2());

       t1.start();
       t2.start();

  }

}