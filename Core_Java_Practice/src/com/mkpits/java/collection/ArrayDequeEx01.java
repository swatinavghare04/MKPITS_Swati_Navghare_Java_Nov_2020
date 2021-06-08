// WAP to demonstrate example on ArrayDeque.

package src.com.mkpits.java.collection;
import java.util.*;

public class ArrayDequeEx01 {
    public static void main(String[] args){
       Deque<String> deque = new ArrayDeque<String>();
       deque.add("Ravi");
        deque.add("Ajay");
        deque.add("Vijay");
        deque.add("Amit");
        deque.add("Golu");

        // Traversing elements
        for(String str : deque){
            System.out.println(str);
        }
    }
}
