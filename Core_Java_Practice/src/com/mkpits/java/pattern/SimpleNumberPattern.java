/* WAP for numeric pattern - Simple number program shown below-
1
12
123
1234
12345
 */

public class SimpleNumberPattern {

  public static void main(String[] args){

    for(int row=1;row<=5;row++){

     for( int column=1;column<=row;column++){

        System.out.print(column);
     }
        System.out.println();
    }
  }
}