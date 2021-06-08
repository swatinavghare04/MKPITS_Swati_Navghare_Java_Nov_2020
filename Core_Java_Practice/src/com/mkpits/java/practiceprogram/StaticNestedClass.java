// WAP to demonstrate example of static nested class.

package src.com.mkpits.java.practiceprogram;

class Animal{
    //  inner class
    class Reptile{
        public void displayInfo(){
            System.out.println("I am a reptile");
        }
    }
    // static class
    static class Mammal{
        public void displayInfo(){
            System.out.println("I am a mammal.");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args){
        // object creation of the outer class
        Animal animal = new Animal();

        // object creation of non-static class
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
    }
}
