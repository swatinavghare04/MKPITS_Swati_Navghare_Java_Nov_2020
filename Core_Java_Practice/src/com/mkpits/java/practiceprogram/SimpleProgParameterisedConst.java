// Simple program to demonstrate how to use parametrised constructor.

package src.com.mkpits.java.practiceprogram;

public class SimpleProgParameterisedConst {
    String languages;
    SimpleProgParameterisedConst(String lang){
        languages = lang;
        System.out.println(languages + "Programming language");
    }
    public static void main(String[] args){
        SimpleProgParameterisedConst obj = new SimpleProgParameterisedConst("Java");
        SimpleProgParameterisedConst obj1 = new SimpleProgParameterisedConst("Sql");
        SimpleProgParameterisedConst obj2 = new SimpleProgParameterisedConst(".Net");
    }
}
