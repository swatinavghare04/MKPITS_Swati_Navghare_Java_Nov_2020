// WAP to run a thread by directly calling the run method

class TestCallRun extends Thread{
      public void run(){
		for(int i=1;i<10;i++){
	      try{
			   Thread.sleep(500);
		     }
		  catch(InterruptedException ee){
               System.out.println(ee);
            }

            System.out.println(i);
	  }
  }

   public static void main(String[] args)
   {
     TestCallRun t1 = new TestCallRun();
     TestCallRun t2 = new TestCallRun();

      t1.run();
      t2.run();
   }
 }
