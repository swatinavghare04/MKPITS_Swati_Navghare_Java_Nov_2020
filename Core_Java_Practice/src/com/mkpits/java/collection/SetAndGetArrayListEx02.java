// example of set and get of arraylist class.

package src.com.mkpits.java.collection;
import java.util.*;
import java.util.ArrayList;

public class SetAndGetArrayListEx02 {
    public static void main(String[] args){
        ArrayList<String> plist = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=3;i++){
            System.out.println("Enter product name : ");
            String str = sc.next();
            plist.add(str);
        }

        System.out.println("product at index 1 " + plist.get(1));
        plist.set(1,"chair");

        for(String st:plist){
            System.out.println("product name : "+ st);
        }
    }
}
