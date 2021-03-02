/* WAP in java for numeric pattern - Simple number program which is given below-

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

import java.util.*;
public class NumberPattern2 {

  public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
       int n = sc.nextInt();
        int count = 0;

    for(int i=1;i<=n;i++){

     for( int j=1;j<=i;j++){
            count= count+1;
           System.out.print(count);

       }
        System.out.println();
    }
  }
}