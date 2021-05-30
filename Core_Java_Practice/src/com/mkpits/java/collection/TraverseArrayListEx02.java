// WAP program on Traversing list through Iterator

package src.com.mkpits.java.collection;
import java.util.*;
import java.util.ArrayList;

public class TraverseArrayListEx02 {
    public static void main(String[] args){
        ArrayList<String> plist = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("Enter product name: ");
            String st = scan.next();
            plist.add(st);
        }
        Iterator itr  = plist.iterator();
        while(itr.hasNext()){
            System.out.println("Product name : " + itr.next());
        }
    }
}
