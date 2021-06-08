// WAP to demonstrate example of HashMap to store key and value pair.

package src.com.mkpits.java.collection;

import java.util.*;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); // Creating HashMap
        // Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
