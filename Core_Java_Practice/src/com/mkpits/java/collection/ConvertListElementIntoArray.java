// WAP to demonstrate example to convert list elements into array.

package src.com.mkpits.java.collection;
import java.util.*;

public class ConvertListElementIntoArray {
    public static void main(String[] args){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        // converting arraylist to array

        String[] arr = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("printing array : " + Arrays.toString(arr));

        System.out.println("Printing list :"+ fruitList);
    }
}
