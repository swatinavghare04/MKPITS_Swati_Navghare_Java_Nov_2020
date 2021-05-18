// WAP to demonstrate use of constructor.

package src.com.mkpits.java.practiceprogram;

public class SimpleProgUseConstructor {
    private String name;
    SimpleProgUseConstructor(){
        System.out.println("Constructor Called :");
        name = "Program";
    }
    public static void main(String[] args){
        SimpleProgUseConstructor obj = new SimpleProgUseConstructor();
        System.out.println("Name is "+ obj.name);
    }
}
