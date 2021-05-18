// WAP to demonstrate example of abstract class and abstract method.

package src.com.mkpits.java.practiceprogram;

abstract class language01{
    public void display(){
        System.out.println("This is java programming");
    }
}
public class AbstractClassAndMethod02 extends language01 {
    public static void main(String[] args){

        AbstractClassAndMethod02 am = new AbstractClassAndMethod02();
        // access method of abstract class using object of main class
        am.display();
    }
}
