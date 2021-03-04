// WAP in java of stringTokenizer class.

import java.util.StringTokenizer;
public class StringTokenizerClass{
public static void main(String[] args){

    StringTokenizer st = new StringTokenizer("My name is swati");
    while(st.hasMoreTokens()){

          System.out.println(st.nextToken());
      }
   }
}