// WAP to demonstrate private access modifiers.

package src.com.mkpits.java.practiceprogram;

class PrivateModifier {
    private String name01 ;

    // getter method
    public String getName01(){
        return this.name01;
    }

    // setter method
    public void setName01(String name01){
        this.name01 = name01;
    }
}
public class PrivateAccessModifier {
    public static void main(String[] args) {
        PrivateModifier  obj = new PrivateModifier();

        obj.setName01("Program");
        System.out.println(obj.getName01());
    }
}
