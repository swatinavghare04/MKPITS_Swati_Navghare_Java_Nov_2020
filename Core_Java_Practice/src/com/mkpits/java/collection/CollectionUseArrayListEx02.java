//  wap to create colllection of 5 students using arraylist class by accepting the name fromthe user.

package src.com.mkpits.java.collection;

import java.util.*;

public class CollectionUseArrayListEx02 {
    public static void main(String[] args){
        ArrayList<String> stud = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<=3;i++){
            System.out.println("Enter name ");
            String studname = scan.next();
            stud.add(studname);

        }
        System.out.println(stud);
    }
}
