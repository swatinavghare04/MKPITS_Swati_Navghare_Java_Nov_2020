// WAP to demonstrate use of this keyword in constructor overloading.

package src.com.mkpits.java.practiceprogram;

public class UseThisConstructorOverloading {
    private int a,b;
    private UseThisConstructorOverloading(int i, int j){
        this.a = i;
        this.b =j;
    }
    private UseThisConstructorOverloading(int i){
        this(i,i);
    }
    private UseThisConstructorOverloading(){
        this(0);
    }
    @Override
    public  String toString(){
        return this.a + "+" +this.b + "i";
    }
    public static void main(String[] args){
        // calls the constructor with 2 parameters
        UseThisConstructorOverloading u1 = new UseThisConstructorOverloading(2,3);

        // calls the constructor with a single parameters
        UseThisConstructorOverloading u2 = new UseThisConstructorOverloading(3);

        // calls the constructor with no parameters
        UseThisConstructorOverloading u3 = new UseThisConstructorOverloading();

        //print objects
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
