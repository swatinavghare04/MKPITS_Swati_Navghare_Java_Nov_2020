// WAP to demonstrate Java Map Example: Non-Generic (Old Style)

package src.com.mkpits.java.collection;
import java.util.*;

public class MapExNonGeneric {
    public static void main(String[] args){
        Map map = new HashMap();

        // Adding elements in map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Vijay");
        map.put(6,"Ajay");

        // Traversing Map
        Set set = map.entrySet();  // Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately

            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
