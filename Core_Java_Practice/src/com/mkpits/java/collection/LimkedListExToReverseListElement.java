// WAP to demonstrate LinkedList Example to reverse a list of elements.

package src.com.mkpits.java.collection;
import java.util.*;

public class LimkedListExToReverseListElement {
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}
