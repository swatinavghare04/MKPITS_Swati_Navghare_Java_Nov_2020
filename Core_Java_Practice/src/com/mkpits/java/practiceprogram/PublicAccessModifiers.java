// WAp to demonstrate public access modifiers.

package src.com.mkpits.java.practiceprogram;

class PublicModifiers{
    //public variable
    public  int legCount;

    // public method
    public void display(){
        System.out.println("I am a human.");
        System.out.println("I have "+legCount + " legs.");
    }
}
public class PublicAccessModifiers {
    public static void main(String[] args){
        PublicModifiers pm = new PublicModifiers();

        pm.legCount = 2;
        pm.display();
    }
}
