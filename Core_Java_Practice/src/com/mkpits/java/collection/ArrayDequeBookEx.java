// WAP to demonstrate ArrayDeque example where we are adding books to list and printing all the books.

package src.com.mkpits.java.collection;

import java.util.*;

class Book4 {
    int id;
    String name, author, publisher;
    int quantity;

    public Book4(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

public class ArrayDequeBookEx {
    public static void main(String[] args) {
        Deque<Book4> set = new ArrayDeque<Book4>();
        //Creating Books
        Book4 b1 = new Book4(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book4 b2 = new Book4(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book4 b3 = new Book4(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to Deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing ArrayDeque
        for (Book4 b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

}
