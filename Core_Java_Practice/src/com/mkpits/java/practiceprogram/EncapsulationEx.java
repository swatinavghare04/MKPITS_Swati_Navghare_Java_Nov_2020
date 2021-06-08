// WAP to demonstrate how to achieve encapsulation.

package src.com.mkpits.java.practiceprogram;

class Area{
    int length,breadth;

    // constructor to initialize values
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea(){
        int area = length * breadth;
        System.out.println("Area : "+ area);
    }
}
public class EncapsulationEx {
    public static void main(String[] args){
        Area rectangle = new Area(6,6);
        rectangle.getArea();
    }
}
