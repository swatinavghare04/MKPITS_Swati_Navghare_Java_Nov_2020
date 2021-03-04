// Example of java synchronized block

class TestTable1{

  void printTable(int n){
	  synchronized(this){

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
}

class TestMyThread03 extends Thread{

    TestTable1 t;
 TestMyThread03(TestTable1 t){

   this.t = t;
 }

  public void run(){

    t.printTable(5);
  }
}

class TestMyThread3 extends Thread{

    TestTable1 t;
 TestMyThread3(TestTable1 t){

   this.t = t;
 }

  public void run(){

    t.printTable(8);
  }
}

 class TestSynchronizedBlock{

   public static void main(String[] args){

       TestTable1 obj = new TestTable1();
      TestMyThread03 t1= new TestMyThread03(obj);
      TestMyThread3 t2= new TestMyThread3(obj);

      t1.start();
      t2.start();

   }
 }