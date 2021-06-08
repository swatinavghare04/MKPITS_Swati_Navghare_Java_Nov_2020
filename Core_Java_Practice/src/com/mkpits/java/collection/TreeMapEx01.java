// WAP to demonstrate example of TreeMap.

package src.com.mkpits.java.collection;
import java.util.*;

public class TreeMapEx01 {
    public static void main(String[] args){
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();
        tmap.put(101,"Amit");
        tmap.put(102,"Ravi");
        tmap.put(103,"Sudhir");
        tmap.put(104,"Golu");

        for(Map.Entry m:tmap.entrySet()){

            System.out.println(m.getKey()+ "" + m.getValue());
        }
    }
}
