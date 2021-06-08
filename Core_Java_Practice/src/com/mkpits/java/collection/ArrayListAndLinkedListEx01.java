// Write a simple program where we are using ArrayList and LinkedList both.

package src.com.mkpits.java.collection;
import java.util.*;

public class ArrayListAndLinkedListEx01 {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        list1.add("Ravi");//adding object in arraylist
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");

        List<String> arrl2=new LinkedList<String>();//creating linkedlist
        arrl2.add("James");//adding object in linkedlist
        arrl2.add("Serena");
        arrl2.add("Swati");
        arrl2.add("Junaid");

        System.out.println("arraylist: "+list1);
        System.out.println("linkedlist: "+arrl2);

    }
}
