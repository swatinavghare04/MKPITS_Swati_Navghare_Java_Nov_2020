// WAP to demonstrate example in case subclass overridden method declares same exception

package src.com.mkpits.java.practiceprogram;

import java.io.*;

class Parent {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

public class ExceptionHandlingEx01 extends Parent{
    void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]){
        Parent p=new ExceptionHandlingEx01();
        try{

            p.msg();
        }catch(Exception e){}
    }
}
