// WAP to demonstrate Java TreeMap Example: remove().

package src.com.mkpits.java.collection;

import java.util.*;

public class TreeMapExRemove {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(101, "Yash");
        tmap.put(104, "Shubham");
        tmap.put(100, "Dhiru");
        tmap.put(103, "Bandu");

        System.out.println("Before Invoking remove() method");
        for (Map.Entry m : tmap.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }

        tmap.remove(101);
        System.out.println("After Invoking remove() method");
        for (Map.Entry m : tmap.entrySet()) {

            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}

