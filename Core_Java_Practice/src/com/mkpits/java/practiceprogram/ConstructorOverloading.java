// WAp to demonstrate example of constructor  overloading.

package src.com.mkpits.java.practiceprogram;

public class ConstructorOverloading {
    String language;
    ConstructorOverloading(){
        this.language = "Java";
    }
    ConstructorOverloading(String language){
        this.language = language;
    }
    public void  getName(){
        System.out.println("Programming language:" + this.language);
    }
    public static void main(String[] args){
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");
        obj1.getName();
        obj2.getName();
    }
}
