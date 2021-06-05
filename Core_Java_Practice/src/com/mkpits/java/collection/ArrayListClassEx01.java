// WAP to demonstrate List where we are using the ArrayList class as the implementation.

package src.com.mkpits.java.collection;
import java.util.*;

public class ArrayListClassEx01 {
    public static void main(String[] args){
        // creating a list
        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

    }
}
