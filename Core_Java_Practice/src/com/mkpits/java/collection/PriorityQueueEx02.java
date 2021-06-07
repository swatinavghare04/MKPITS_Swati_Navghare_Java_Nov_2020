// WAP to demonstrate priority queue example : where we are adding books to queue and printing all the books.

package src.com.mkpits.java.collection;
import java.util.*;

class Book3 implements Comparable<Book3>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book3(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book3 b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}

public class PriorityQueueEx02 {
    public static void main(String[] args) {
        Queue<Book3> queue=new PriorityQueue<Book3>();
        //Creating Books
        Book3 b1=new Book3(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book3 b2=new Book3(233,"Operating System","Galvin","Wiley",6);
        Book3 b3=new Book3(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book3 b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for(Book3 b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

}
