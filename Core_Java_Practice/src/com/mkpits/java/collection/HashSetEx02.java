// WAP to demonstrate HashSet example ignoring duplicate elements

package src.com.mkpits.java.collection;
import java.util.*;

public class HashSetEx02 {
    public static void main(String[] args){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
