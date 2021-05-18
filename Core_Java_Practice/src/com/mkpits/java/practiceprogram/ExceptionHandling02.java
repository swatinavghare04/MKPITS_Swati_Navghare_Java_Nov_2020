// WAp to demonstrate example in case subclass overridden method declares subclass exception

package src.com.mkpits.java.practiceprogram;

import java.io.*;

class Parent01 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

public class ExceptionHandling02 extends Parent01{
    void msg()throws ArithmeticException{System.out.println("child");}

    public static void main(String args[]){
        Parent01 p=new ExceptionHandling02();
        try{
            p.msg();
        }catch(Exception e){}
    }
}
