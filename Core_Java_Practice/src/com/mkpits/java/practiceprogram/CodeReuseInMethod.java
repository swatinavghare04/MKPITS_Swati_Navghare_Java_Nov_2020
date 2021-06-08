// WAP to demonstrate method for code reusability.

package src.com.mkpits.java.practiceprogram;

public class CodeReuseInMethod {
    private  static  int getSquare(int x){
        return x * x;
    }
    public static void main(String[] args){
        for(int num=1; num<=5;num++){
            int result = getSquare(num);
            System.out.println("Square :" +num);
        }
    }
}
