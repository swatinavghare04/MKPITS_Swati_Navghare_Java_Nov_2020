// WAP to demonstrate example of Java LinkedHashSet class.

package src.com.mkpits.java.collection;
import java.util.*;

public class LinkedHashSetEx01 {
    public static void main(String[] args){
        // creating Hashset and adding element

        LinkedHashSet<String> link = new LinkedHashSet();
        link.add("One");
        link.add("Two");
        link.add("Three");
        link.add("Four");
        link.add("Five");

        Iterator<String> str = link.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }
    }
}
