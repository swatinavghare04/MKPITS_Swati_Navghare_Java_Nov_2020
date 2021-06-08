// WAP to count the vowel and consonant in the given string.

package src.com.mkpits.java.practiceprogram;

import java.util.Locale;

public class CountVowelConsonantInString {
    public static void main(String[] args) {
        String str = "I am from Maharashtra in India";
        int Vcount = 0;
        int cCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                Vcount++;
        }
        else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){

            cCount++;
           }
        }
        System.out.println("Total number of Vowels : " + Vcount);
        System.out.println("Total number of consonant : " + cCount);
    }
}
