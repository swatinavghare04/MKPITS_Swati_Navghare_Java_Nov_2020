// WAP in java to illustrate synchronized method

class TestTable4{

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

class TestMyThread1 extends Thread{

    TestTable4 t;
    TestMyThread1(TestTable4 t){

   this.t = t;
 }

  public void run(){

    t.printTable(5);
  }
}

class TestMyThread2 extends Thread{

    TestTable4 t;
    TestMyThread2(TestTable4 t){

   this.t = t;
 }

  public void run(){

    t.printTable(8);
  }
}

 class TestSynchronization1{

   public static void main(String[] args){

       TestTable4 obj = new TestTable4();
       TestMyThread1 t1= new TestMyThread1(obj);
       TestMyThread2 t2= new TestMyThread2(obj);

      t1.start();
      t2.start();

   }
 }