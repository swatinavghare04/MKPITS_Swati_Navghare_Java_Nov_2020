// WAP to demonstrate ArrayList example to isEmpty()   elements.

package src.com.mkpits.java.collection;

import java.util.*;

public class ArrayListEx05 {
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
    }

}
