// WAP to demonstrate example on PriorityQueue.

package src.com.mkpits.java.collection;
import java.util.*;

public class PriorityQueueEx01 {
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Karan");
        queue.add("Shubham");
        queue.add("Rohit");

        System.out.println("head :" + queue.element());
        System.out.println("head :" + queue.peek());
        System.out.println("Iterating the queue elements");

         Iterator itr = queue.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }

         queue.remove();
         queue.poll();

         System.out.println("after removing two elements : ");
         Iterator<String> itr2 = queue.iterator();
         while (itr2.hasNext()){
             System.out.println(itr2.next());
         }

    }
}
