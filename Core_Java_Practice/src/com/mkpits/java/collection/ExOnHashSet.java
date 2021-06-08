// WAP to demonstrate example on Hashset

package src.com.mkpits.java.collection;
import java.util.*;

public class ExOnHashSet {
    public static void main(String[] args){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
