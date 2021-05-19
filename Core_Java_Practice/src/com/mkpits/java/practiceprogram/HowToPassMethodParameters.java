// WAP to demonstrate how to pass the parameter to method.

package src.com.mkpits.java.practiceprogram;

public class HowToPassMethodParameters {
    // method with no parameters
    public void display1() {
        System.out.println("Method without parameters");
    }

    // method with single parameter
    public void display2(int a) {
        System.out.println("Method with single parameter :" + a);
    }

    public void display3(int a, int b) {
        System.out.println("Method with single parameter :" + a + "/n" + b);
    }

    public static void main(String[] args) {
        HowToPassMethodParameters obj = new HowToPassMethodParameters();
        obj.display1();
        obj.display2(20);
        obj.display3(10, 30);
    }
}
