// program on Traversing list through Iterator.

package src.com.mkpits.java.collection;

import java.util.*;
import java.util.ArrayList;

public class TraverseListThroughIterator {
    public static void main(String[] args){
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("Enter name : ");
            String str = sc.next();
            stud.add(str);
        }
        Iterator itr = stud.iterator();
        while(itr.hasNext()){
            System.out.println("Student Name :" +itr.next());
        }
    }
}
