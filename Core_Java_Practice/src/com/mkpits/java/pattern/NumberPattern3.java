/* WAP in java for numeric pattern - Simple number programwhich is given below-

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

public class NumberPattern3 {

  public static void main(String[] args){

    for(int i=1;i<=5;i++){

     for( int j=1;j<=i;j++){

        System.out.print(i);
     }
        System.out.println();
    }
  }
}