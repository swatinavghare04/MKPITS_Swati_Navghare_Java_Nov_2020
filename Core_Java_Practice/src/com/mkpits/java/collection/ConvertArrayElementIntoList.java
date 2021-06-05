// WAP to demonstrate example to convert array elements into List.

package src.com.mkpits.java.collection;
import java.util.*;

public class ConvertArrayElementIntoList {
    public static void main(String[] args){
        // creating Array
        String[] arr = {"Java","PHP","SQL"};
        System.out.println("Printinh Array :" + Arrays.toString(arr));

        // converting array to list
        List<String> list = new ArrayList<String>();
        for(String lang:arr){
            list.add(lang);
        }
        System.out.println("Printing list" + list);
    }
}
