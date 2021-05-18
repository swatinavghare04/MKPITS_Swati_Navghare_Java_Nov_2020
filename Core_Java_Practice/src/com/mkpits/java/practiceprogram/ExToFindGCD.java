// WAP to find GCD of two numbers.

package src.com.mkpits.java.practiceprogram;

public class ExToFindGCD {
    public static void main(String[] args){
        int x = 80, y= 20,gcd = 1;

        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0)
                gcd=i;
        }
        System.out.println("GCD of x and y is "+ gcd);
    }
}
