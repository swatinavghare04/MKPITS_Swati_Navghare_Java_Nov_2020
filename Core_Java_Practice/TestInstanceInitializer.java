// Example of instance initializer block.

    class TestInstanceInitializer{  
        int speed;  
          
        TestInstanceInitializer(){System.out.println("speed is "+speed);}  
       
        {speed=100;}  
           
        public static void main(String args[]){  
        TestInstanceInitializer b1=new TestInstanceInitializer();  
        TestInstanceInitializer b2=new TestInstanceInitializer();  
        }      
    }  