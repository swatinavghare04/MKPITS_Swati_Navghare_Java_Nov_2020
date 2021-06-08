// WAP to demonstrate example to retrieve and remove the highest and lowest Value.

package src.com.mkpits.java.collection;
import java.util.*;

public class TreeSetEx03 {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(203);
        set.add(78);
        set.add(10);
        System.out.println("Highest Value : "+ set.pollFirst());
        System.out.println("Lowest Value : "+ set.pollLast());

    }
}
