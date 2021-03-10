// Program of performing single task by multiple threads.

class ExOfSingleTaskByMultipleThread extends Thread{
   
   public void run(){
   
   System.out.println("task one");
   }
   
  public static void main(String[] args){
  
       ExOfSingleTaskByMultipleThread t1 = new ExOfSingleTaskByMultipleThread();
       ExOfSingleTaskByMultipleThread t2 = new ExOfSingleTaskByMultipleThread();
       ExOfSingleTaskByMultipleThread t3 = new ExOfSingleTaskByMultipleThread();
       
       t1.start();
       t2.start();
       t3.start();
       
  }
  
}