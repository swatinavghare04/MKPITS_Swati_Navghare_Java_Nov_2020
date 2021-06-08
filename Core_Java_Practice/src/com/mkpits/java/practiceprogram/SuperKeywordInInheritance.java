// WAP to demonstrate super keyword in java.

package src.com.mkpits.java.practiceprogram;

class Inheritance01{
    // method in the super class
    public void eat(){
        System.out.println("I can eat");
    }
}
class Inheritance02 extends Inheritance01{
    // overriding eat() method
    public  void eat(){
        // call method of super class
        super.eat();
        System.out.println("I eat delicious food");
    }
}
public class SuperKeywordInInheritance {
    public static void main(String[] args){
        // create object of a subclass
        Inheritance02 l2 = new Inheritance02();

        // call eat() method
        l2.eat();
    }
}
