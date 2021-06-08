// wap to create colllection of 5 students using arraylist class by accepting the name from the user.

package src.com.mkpits.java.collection;
import java.util.*;

public class CollectOfProductUseArrayListEx02 {
    public static void main(String[] args){
        ArrayList<String> plist = new ArrayList<String>();
        Scanner Sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("enter product name : ");
            String str = Sc.next();
            plist.add(str);
        }
        System.out.println(plist);
    }
}
