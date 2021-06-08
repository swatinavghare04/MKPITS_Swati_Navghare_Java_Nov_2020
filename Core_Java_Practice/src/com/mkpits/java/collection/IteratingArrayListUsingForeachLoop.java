// WAP to traverse the ArrayList elements using the for-each loop

package src.com.mkpits.java.collection;
import java.util.*;

public class IteratingArrayListUsingForeachLoop {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");

        // Traversing arraylist using for-each loop
        for(String Fruit:list)

            System.out.println(Fruit);
    }
}
