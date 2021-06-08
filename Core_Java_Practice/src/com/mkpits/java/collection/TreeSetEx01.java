// WAP to demonstrate example of Java TreeSet.

package src.com.mkpits.java.collection;
import java.util.*;

public class TreeSetEx01 {
    public static void main(String[] args){
        // creating and adding elements

        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Ravi");
        tset.add("Vijay");
        tset.add("Ajay");
        tset.add("Rahul");
        tset.add("Gaurav");

        // Traversing element
        Iterator<String> itr = tset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
