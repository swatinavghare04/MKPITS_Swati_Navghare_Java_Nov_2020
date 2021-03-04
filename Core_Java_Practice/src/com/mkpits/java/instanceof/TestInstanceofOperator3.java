// WAP in java to illustrate downcasting with instanceof operator.

class TestAnimal { }

    class TestInstanceofOperator3 extends TestAnimal {
      static void method(TestAnimal a) {
        if(a instanceof TestInstanceofOperator3){
           TestInstanceofOperator3 d=(TestInstanceofOperator3)a;//downcasting
           System.out.println("ok downcasting performed");
        }
      }

      public static void main (String [] args) {
          TestAnimal a=new TestInstanceofOperator3();
        TestInstanceofOperator3.method(a);
      }

     }