// WAp to demonstrate how to find the factorial using recursion.

package src.com.mkpits.java.practiceprogram;

public class FactorialUseRecursion {
    static  int factorial(int n){
        if(n !=0)
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
    public static void main(String[] args){
        int num = 4, result;
        result = factorial(num);
        System.out.println(num + "factorial = " +result);
    }
}
