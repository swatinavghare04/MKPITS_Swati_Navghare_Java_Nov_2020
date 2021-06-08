// WAP to demonstrate example on linkedlist

package src.com.mkpits.java.collection;
import java.util.*;

public class LinkedListEx01 {
    public static void main(String[] args){
        LinkedList<String> l1= new LinkedList<String>();
        l1.add("Ravi");
        l1.add("Vijay");
        l1.add("Ravi");
        l1.add("Ajay");

        Iterator<String> itr = l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
