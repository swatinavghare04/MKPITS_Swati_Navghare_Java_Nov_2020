/* WAP in java to print number pattern given below :
123456789
  23456789
   3456789
    456789
     56789
      6789
       789
        89
         9
        89
       789
      6789
     56789
    456789
   3456789
  23456789
 123456789
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx08{
    public static void main(String[] args){

        int row,col;
        for(row=1;row<=9;row++){
            for(col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(col=row;col<=9;col++){

                System.out.print(col);
            }
            System.out.println();
        }
        for(row=8;row>=1;row--){
            for(col=1;col<=row;col++){

                System.out.print(" ");
            }
            for(col=row;col<=9;col++){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
