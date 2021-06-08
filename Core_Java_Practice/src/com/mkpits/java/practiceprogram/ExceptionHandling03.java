// WAP to demonstrate example in case subclass overridden method declares no exception.

package src.com.mkpits.java.practiceprogram;
import java.io.*;

class Parent02{
    void msg()throws Exception{System.out.println("parent");}
}

public class ExceptionHandling03 extends Parent02 {
    void msg(){System.out.println("child");}

    public static void main(String args[]){
        Parent02 p=new ExceptionHandling03();
        try{
            p.msg();
        }catch(Exception e){}
    }
}
