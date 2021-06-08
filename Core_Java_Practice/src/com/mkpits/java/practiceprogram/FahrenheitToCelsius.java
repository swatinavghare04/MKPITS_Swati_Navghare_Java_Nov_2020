// WAp to demonstrate how to covert fahrenheit to celsius.

package src.com.mkpits.java.practiceprogram;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        double a,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fagrenheit Temperature");
        a = sc.nextDouble();
        System.out.println("Celsius temperature is =" + celsius(a));
    }
    static double celsius(double f){
        return (f-32)*5/9;
    }
}
