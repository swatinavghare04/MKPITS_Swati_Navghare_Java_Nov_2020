// WAP to demonstrate linkedHashMap example where we are adding books to list and printing all the books.

package src.com.mkpits.java.collection;
import java.util.*;

class Book6 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book6(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedHashMApBook {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, Book6> map = new LinkedHashMap<Integer, Book6>();
        //Creating Books
        Book6 b1 = new Book6(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book6 b2 = new Book6(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book6 b3 = new Book6(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, Book6> entry : map.entrySet()) {
            int key = entry.getKey();
            Book6 b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
