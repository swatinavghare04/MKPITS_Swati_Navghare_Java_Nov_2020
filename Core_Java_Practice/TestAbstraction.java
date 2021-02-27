// Example of an abstract class that has abstract and non-abstract methods and constructor.

abstract class Bike{

    Bike(){
    
             System.out.println("Bike is created");
         }
    
    abstract void run();
    
    void changeGear(){
    
             System.out.println("gear changed");
       }
     }
    
    class Honda extends Bike{
    
        void run(){
        
           System.out.println("running safely");
        }    
    }

 class TestAbstraction{
 
    public static void main(String[] args){
    
       Bike b = new Honda();
       b.run();
       b.changeGear();
    }
 }