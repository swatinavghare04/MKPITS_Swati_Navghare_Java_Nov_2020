/* WAP in java to print below number pattern-
123456789
234567891
345678912
456789123
567891234
678912345
789123456
891234567
912345678
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx11{
    public static void main(String[] args){

        int row,col,n=8;
        for(row=1;row<=n+1;row++){
            for(col=row;col<=n+1;col++){
                System.out.print(col);
            }
            for(int k=1;k<row;k++){

                System.out.print(k);
            }
            System.out.println();
        }
    }
}
