// WAP to swap two string variables without using third or temp variable.

package src.com.mkpits.java.practiceprogram;

public class SwapString {
    public static void main(String[] args){
        String str1 = "Good", str2 = "Morning";
        System.out.println("String befor swaping :" + str1 +" "+ str2);
        str1 = str1+str2;
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("String after swaping :"+ str1 + " " + str2);
    }
}