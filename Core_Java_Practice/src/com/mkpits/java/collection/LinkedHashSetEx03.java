// WAP to demonstrate example on linked hashset.

package src.com.mkpits.java.collection;
import java.util.*;

class Book1{
    int id;
    String name,author,publisher;
    int quantity;

    Book1(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}
public class LinkedHashSetEx03 {
    public static void main(String[] args){
        LinkedHashSet<Book1> link2 = new LinkedHashSet<Book1>();

        // Creating Books
        Book1 b1 = new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);

        // Adding Books to hash table

        link2.add(b1);
        link2.add(b2);
        link2.add(b3);

        // Traversing hash table
        for(Book1 b:link2) {
            System.out.println(b.id + "" + b.name + "" + b.author + "" + b.publisher + "" + b.quantity);
        }

    }

}
