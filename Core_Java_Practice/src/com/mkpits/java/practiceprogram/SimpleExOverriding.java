// WAP to demonstrate the example of method overriding.

package src.com.mkpits.java.practiceprogram;

class Overrriding{
    public void displayInfo(){
        System.out.println("I am an animal");
    }
}

class Overrriding02 extends Overrriding{
    public void displayInfo(){
        System.out.println("I am a dog");
    }
}

public class SimpleExOverriding {
    public static void main(String[] args){
        Overrriding02 o1 = new Overrriding02();
        o1.displayInfo();
    }
}
