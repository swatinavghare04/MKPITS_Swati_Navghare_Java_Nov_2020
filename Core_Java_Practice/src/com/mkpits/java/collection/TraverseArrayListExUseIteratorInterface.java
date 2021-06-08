//WAP to traverse ArrayList elements using the Iterator interface.to traverse
// ArrayList elements using the Iterator interface.

package src.com.mkpits.java.collection;
import java.util.*;
public class TraverseArrayListExUseIteratorInterface {
    public static void main(String[] args){
        ArrayList<String> Arrlist = new ArrayList<String>(); // creating array list
        Arrlist.add("Swati"); // Addinng objetc in array list
        Arrlist.add("Swapnil");

        // Traverse arraylist using Iterator

        Iterator it = Arrlist.iterator(); // getting arraylist

        // check if iterator has the element
        while(it.hasNext()){

            System.out.println(it.next());  // printing the element and move to next
        }

    }
}
