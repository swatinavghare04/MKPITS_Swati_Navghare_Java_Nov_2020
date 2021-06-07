// WAP to demonstrate example of LinkedHashMap.

package src.com.mkpits.java.collection;
import java.util.*;

public class LinkedHashMapEx01 {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> link = new LinkedHashMap<Integer,String>();

        link.put(100,"Amit");
        link.put(101,"Vijay");
        link.put(102,"Rahul");

        for(Map.Entry m : link.entrySet()){
            System.out.println(m.getKey()+ "" + m.getValue() );
        }
    }
}
