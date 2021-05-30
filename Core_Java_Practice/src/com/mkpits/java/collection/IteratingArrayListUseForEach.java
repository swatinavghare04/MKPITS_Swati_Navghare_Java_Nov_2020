// program on Iterating ArrayList using For-each loop.

package src.com.mkpits.java.collection;
import java.util.*;
import java.util.ArrayList;

public class IteratingArrayListUseForEach {
    public static void main(String[] args){
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("Enter name : ");
            String str = sc.next();
            stud.add(str);
        }
        for(String s:stud){
            System.out.println("Student Name : "+s );
        }
    }
}
