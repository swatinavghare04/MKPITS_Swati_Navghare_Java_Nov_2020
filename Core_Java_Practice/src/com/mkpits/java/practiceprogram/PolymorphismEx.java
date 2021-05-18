// WAP to demonstrate example of polymorphism.

package src.com.mkpits.java.practiceprogram;

import java.awt.*;

class Polygon{
    public void render(){
        System.out.println("Rendering polygon");
    }
}
class Square extends Polygon {
    public void render(){
        System.out.println("Rendering Square");
    }
}
class Circle extends Polygon {
    public void render(){
        System.out.println("Rendering Circle");
    }
}
public class PolymorphismEx {
    public static void main(String[] args){
        Polygon p = new Polygon();
        p.render();

        // create object of square class
        Square s1 = new Square();
        s1.render();

        // create object of circle class
        Circle c1 = new Circle();
        c1.render();

    }
}
