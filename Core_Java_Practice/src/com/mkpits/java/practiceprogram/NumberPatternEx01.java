/* WAP in java to print number pattern given below :
1 2 3 4 5 6 7 8 9 10
 2 3 4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10
   4 5 6 7 8 9 10
    5 6 7 8 9 10
     6 7 8 9 10
      7 8 9 10
       8 9 10
        9 10
         10
        9 10
       8 9 10
      7 8 9 10
     6 7 8 9 10
    5 6 7 8 9 10
   4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10
 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx01{
    public static void main(String[] args){

        for(int row=1;row<=10;row++){
            for(int col=1;col<row;col++){

                System.out.print(" ");
            }
            for(int col2=row;col2<=10;col2++){

                System.out.print(col2 + " ");
            }

            System.out.println();
        }

        for(int row=9;row>=1;row--){
            for(int col=1;col<row;col++){

                System.out.print(" ");
            }
            for(int col2=row;col2<=10;col2++){

                System.out.print(col2 + " ");
            }

            System.out.println();
        }
    }
}
