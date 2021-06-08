// WAP to demonstrate how to sort array.

package src.com.mkpits.java.collection;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args){
        // creating array list
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Orange");

        // Sort array
        Collections.sort(al);

        // Travetsing array list
        for(String fruit:al)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");

        // Creating the list of numbers
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);

        // Sorting the list
        Collections.sort(list2);

        // Traversing the list
        for(Integer num:list2)
            System.out.println(num);

    }
}
