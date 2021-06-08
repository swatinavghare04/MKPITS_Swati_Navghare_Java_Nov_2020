// program on traversing arraylist using foreach loop

package src.com.mkpits.java.collection;
import java.util.ArrayList;
import  java.util.*;

public class TraversingArrayListUSeForEach {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        stud.forEach(x -> {System.out.println(x);});
    }

}
