// WAP to demonstrate get() method returns the element at the specified index,
// whereas the set() method changes the element.

package src.com.mkpits.java.collection;

import java.util.*;

public class GetAndSetArrayList {
    public static void main(String[] args){
        // Creating arraylist
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");

        // Accessing element
        System.out.println("Returning Element : "+ al.get(1));

        // Changing the element
        al.set(1,"Dates");

        // Traversing list
        for(String fruit:al)
            System.out.println(fruit);
    }
}
