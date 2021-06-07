// WAP to demonstrate Java LinkedHashSet example ignoring duplicate Elements.

package src.com.mkpits.java.collection;
import java.util.*;

public class LinkedHashSetEx02 {
    public static void main(String[] args){
        LinkedHashSet<String> link1 = new LinkedHashSet<String>();
        link1.add("Ravi");
        link1.add("Ajay");
        link1.add("Rahul");
        link1.add("Ravi");

        Iterator<String> str = link1.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }
    }
}
