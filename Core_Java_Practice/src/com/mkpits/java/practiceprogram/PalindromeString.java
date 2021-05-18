// WAP to determine whether a given string is palindrome or not.

package src.com.mkpits.java.practiceprogram;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args){
        String str = "eye";
        boolean flag = true;

        str = str.toLowerCase();

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is not Palindrome");
    }
}
