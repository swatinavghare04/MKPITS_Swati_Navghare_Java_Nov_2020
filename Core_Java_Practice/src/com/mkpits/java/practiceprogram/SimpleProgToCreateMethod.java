// WAP to demonstrate method return type.

package src.com.mkpits.java.practiceprogram;

public class SimpleProgToCreateMethod {

    public static int square(int num){
        return num*num;
    }
    public static void main(String[] args){
        int result;
        result = square(20);
        System.out.println("Square value is :" + result);
    }
}
