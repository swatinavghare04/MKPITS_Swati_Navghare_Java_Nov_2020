// program on Iterating ArrayList using For-each loop.

package src.com.mkpits.java.collection;
import java.util.*;
import java.util.ArrayList;

public class IteratingArrayListUseForEachEx02 {
    public static void main(String[] args){
        ArrayList<String> plist  = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("Enter product name : ");
            String pl = sc.next();while (plist.isEmpty())
            plist.add(pl);
        }
        System.out.println(plist);
        for(String str : plist){
            System.out.println("Product Name : "+ str);
        }

    }
}
