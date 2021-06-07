// WAP to demonstrate example of traversing elements in descending order.

package src.com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class TreeSetEx02 {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<String>();
        set.add("RAvi");
        set.add("Ajay");
        set.add("Swapnil");

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = set.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
