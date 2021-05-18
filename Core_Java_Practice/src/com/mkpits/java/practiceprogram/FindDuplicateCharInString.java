// WAp to find the duplicate characters in a string.

package src.com.mkpits.java.practiceprogram;

public class FindDuplicateCharInString {
    public static void main(String[] args){
        String str1 = "Great Learning";
        int count;

        char str[] = str1.toCharArray();
        System.out.println("Duplicate character in a given string");
        for(int i=0;i<str.length;i++){
            count = 1;
            for(int j=i+1;j<str.length;j++){
                if(str[i]==str[j]&&str[i]!=' '){
                    count++;
                    str[j]='0';
                }
            }
            if(count>1 && str[i]!='0')
                System.out.println(str[i]);
        }
    }
}
