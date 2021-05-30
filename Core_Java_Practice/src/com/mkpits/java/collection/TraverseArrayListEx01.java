// WAP to traverse the ArrayList elements

package src.com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseArrayListEx01 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(); //  creating array list
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        // traversing list
        System.out.println("Traversing list through list iterator : ");
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list through for loop : ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through forEach() method :");
        list.forEach(a->{
            System.out.println(a);
        });
        System.out.println("Traversing list through forEacgRemaining() Method : ");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }
}
