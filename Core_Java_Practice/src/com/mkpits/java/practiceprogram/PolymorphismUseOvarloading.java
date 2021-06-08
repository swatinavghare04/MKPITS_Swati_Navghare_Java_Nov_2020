// WAP to demonstrate example of polymorphism using method overloading.

package src.com.mkpits.java.practiceprogram;

class Pattern{
    // method without parameter
    public void display(){
        for(int i =0;i<=5;i++){
            System.out.print("*");
        }
    }
    // method with single parameter
    public void display(char symbol){
        for(int i =0;i<=5;i++){
            System.out.print(symbol);
        }
    }
}
public class PolymorphismUseOvarloading {
    public static void main(String[] args){
        Pattern p1 = new Pattern();

        p1.display();
        System.out.println("\n");

        p1.display('#');
    }
}
