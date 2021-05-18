// WAP to demonstrate this keyword with getters and setters method.

package src.com.mkpits.java.practiceprogram;

public class ThisWithGetterSetter {
    String name02;

    // setter method
    void setName02(String name02){
        this.name02 = name02;
    }

    // getter method
    String getName02(){
        return name02;
    }
    public static void main(String[] args){
        ThisWithGetterSetter obj = new ThisWithGetterSetter();

        obj.setName02("Swati");
        System.out.println("Obj.name :" +obj.getName02());
    }
}
