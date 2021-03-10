// Program of performing single task by multiple threads -  Runnable interface.

class ExOfSingleTaskByMultipleThreadUseRunnableInterface implements Runnable{

   public void run(){

   System.out.println("task one");
   }

  public static void main(String[] args){

       Thread t1 = new Thread(new ExOfSingleTaskByMultipleThreadUseRunnableInterface());
       Thread t2 = new Thread(new ExOfSingleTaskByMultipleThreadUseRunnableInterface());

       t1.start();
       t2.start();

  }

}