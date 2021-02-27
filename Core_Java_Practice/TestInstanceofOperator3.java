// Example of downcasting with instanceof operator.

class Animal { }

    class TestInstanceofOperator3 extends Animal {
      static void method(Animal a) {
        if(a instanceof TestInstanceofOperator3){
           TestInstanceofOperator3 d=(TestInstanceofOperator3)a;//downcasting
           System.out.println("ok downcasting performed");
        }
      }

      public static void main (String [] args) {
        Animal a=new TestInstanceofOperator3();
        TestInstanceofOperator3.method(a);
      }

     }