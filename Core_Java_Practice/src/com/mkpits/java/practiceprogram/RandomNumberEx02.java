// WAP in java to create a random number between 200 to 400.


package src.com.mkpits.java.practiceprogram;

import java.lang.Math;
public class RandomNumberEx02{
    public static void main(String[] args){

        int min=200;
        int max=400;
        // Generating random double value from 200 to 400
        System.out.println("Random value of type double between,  "+min+"to"+ max+":");
        double b = Math.random()*(max-min+1)+min;
        System.out.println(b);

        // Generating random integer value from 200 to 400.
        System.out.println("Random value of type integer between "+min+"to"+ max+":");
        int a = (int)(Math.random()*(max-min+1)+min);
        System.out.println(a);

    }
}
