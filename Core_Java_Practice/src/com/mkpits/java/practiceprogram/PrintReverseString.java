// WAP to find reverse of the string.

package src.com.mkpits.java.practiceprogram;

public class PrintReverseString {
    public static void main(String[] args){
        String str = "Stay Safe";
        String reverseStr = "";

        for(int i=str.length()-1;i>=0;i--){
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("Original String : " +str);
        System.out.println("Reverse String : " +reverseStr);
    }
}
