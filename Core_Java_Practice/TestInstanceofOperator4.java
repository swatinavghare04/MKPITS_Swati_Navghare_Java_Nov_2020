// Example of downcasting with instanceof operator.

 class Animal { }  
 
    class TestInstanceofOperator4 extends Animal {  
    
      static void method(Animal a) {  
      
           TestInstanceofOperator4 d=(TestInstanceofOperator4)a;//downcasting  
           System.out.println("ok downcasting performed");  
      }  
       public static void main (String [] args) {  
        Animal a=new TestInstanceofOperator4();  
       TestInstanceofOperator4.method(a);  
      }  
    }  