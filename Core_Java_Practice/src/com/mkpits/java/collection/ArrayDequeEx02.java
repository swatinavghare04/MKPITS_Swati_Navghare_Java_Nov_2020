// WAP to demonstrate ArrayDeque Example: offerFirst() and pollLast().

package src.com.mkpits.java.collection;

import java.util.*;

public class ArrayDequeEx02 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");

        System.out.println("After offerFirst Traversal...");
        for (String str : deque) {
            System.out.println(str);
        }

        deque.poll();  // deque.pollFirst() - Same
        deque.pollLast();

        System.out.println("After pollLast() Traversal...");
        for (String s : deque) {
            System.out.println(s);
        }

    }
}
