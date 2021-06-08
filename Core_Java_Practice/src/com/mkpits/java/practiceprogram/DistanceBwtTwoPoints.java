// WAP to calculate distance between two points.

package src.com.mkpits.java.practiceprogram;

import java.lang.Math.*;
public class DistanceBwtTwoPoints {
    public static void main(String[] args){
        int x1=1,x2=4,y1=1,y2=4;
        double distance;
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance between two points "+ distance);
    }
}
