/* WAP in java for numeric pattern - Simple number programwhich is given below-

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

package src.com.mkpits.java.pattern;

public class NumberPattern3 {

  public static void main(String[] args){

    for(int row=1;row<=5;row++){

     for( int column=1;column<=row;column++){

        System.out.print(row);
     }
        System.out.println();
    }
  }
}