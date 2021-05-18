// WAP to count the total number of character in a string.

package src.com.mkpits.java.practiceprogram;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str = "I Love India";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) !=' ')
                count++;
        }
        System.out.println("Total number of character : " + count);
    }
}
