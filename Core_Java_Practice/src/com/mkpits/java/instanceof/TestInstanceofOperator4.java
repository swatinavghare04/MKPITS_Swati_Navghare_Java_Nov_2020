// Example of downcasting with instanceof operator.

 class TestAnimal1 { }
 
    class TestInstanceofOperator4 extends TestAnimal1 {
    
      static void method(TestAnimal1 a) {
      
           TestInstanceofOperator4 d=(TestInstanceofOperator4)a;//downcasting  
           System.out.println("ok downcasting performed");  
      }  
       public static void main (String [] args) {
           TestAnimal1 a=new TestInstanceofOperator4();
       TestInstanceofOperator4.method(a);  
      }  
    }  