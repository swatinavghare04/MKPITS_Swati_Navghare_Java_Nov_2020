// WAP in java to demonstrate Constructor use class name as circle.

import java.util.*;

class TestCircleClass {
    private double radius;
    private String color;
    float pi = 3.14f;

    TestCircleClass() {
        double radius = 1.0;
        String color = "Red";
    }

    TestCircleClass(double rad, String col) {
        radius = rad;
        color = col;
    }

    void getRadius() {
        System.out.println("radius =" + radius);
    }

    void setRadius() {
        System.out.println("enter radius");
    }

    void getColor() {
        System.out.println("color =" + color);
    }

    void setColor() {
        System.out.println("enter color");
    }

}


class TestConstructorExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TestCircleClass c1 = new TestCircleClass();
        c1.setRadius();
        double r = scan.nextDouble();
        c1.getRadius();
        c1.setColor();
        String co = scan.next();
        c1.getColor();
        TestCircleClass c2 = new TestCircleClass(12, "green");
    }
}