// Example of nextToken(String delim) method of stringTokenizer class.

import java.util.StringTokenizer;

public class StringTokenizerClass1{
public static void main(String[] args){

    StringTokenizer st = new StringTokenizer("My name is swati");
    
          System.out.println("Next Token is : " + st.nextToken(","));
  
   }
}