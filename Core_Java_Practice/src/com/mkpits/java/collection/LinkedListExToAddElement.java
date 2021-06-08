// WAP to demonstrate LinkedList example to add elements

package src.com.mkpits.java.collection;
import java.util.*;

public class LinkedListExToAddElement {
    public static void main(String[] args){
        LinkedList<String> l2 = new LinkedList<String>();
        System.out.println("Initial list of elements : " + l2);
        l2.add("Swati");
        l2.add("Sonu");
        System.out.println("After invoking add(E e) method :" + l2);
        //Adding an element at the specific position
        l2.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+l2);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        //Adding second list elements to the first list
        l2.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+l2);
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");
        //Adding second list elements to the first list at specific position
        l2.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+l2);
        //Adding an element at the first position
        l2.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+l2);
        //Adding an element at the last position
        l2.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+l2);

    }
}
