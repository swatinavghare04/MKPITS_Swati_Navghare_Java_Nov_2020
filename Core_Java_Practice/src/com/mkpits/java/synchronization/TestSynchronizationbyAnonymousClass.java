// program of synchronized method by using annonymous class

class TestTable5{

  synchronized void printTable(int n){

    for(int i=1;i<=5;i++){

        System.out.println(n*i);

      try{

         Thread.sleep(400);

      } catch(Exception e){

        System.out.println(e);

       }
    }
  }
}

 class TestSynchronizationbyAnonymousClass {

   public static void main(String[] args){

      final TestTable5 obj = new TestTable5();

      Thread t1= new Thread(){

        public void run(){

        obj.printTable(5);
        }
      };
      Thread t2= new Thread(){

            public void run(){

            obj.printTable(8);
            }
      };

      t1.start();
      t2.start();

   }
 }