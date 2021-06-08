// WAP to demonstrate how we can implement abstract method.

package src.com.mkpits.java.practiceprogram;
abstract class Animal02{
    abstract void makeSound();
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal02{
    // provide implementation of abstract method
    public void makeSound(){
        System.out.println("Bark bark");
    }
}
public class AbstractMethod {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}
