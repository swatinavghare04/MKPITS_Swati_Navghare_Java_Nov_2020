// WAp to demonstrate example, we perform various SortedSetSet operations.

package src.com.mkpits.java.collection;
import java.util.*;

public class TreeSetEx05 {
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "E"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }

}
