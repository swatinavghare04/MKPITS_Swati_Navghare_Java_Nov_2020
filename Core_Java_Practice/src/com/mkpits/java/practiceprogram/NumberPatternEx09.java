/* WAP in java to print below number pattern-

11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888

 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx09{
    public static void main(String[] args){

        int row,col;
        for(row=1;row<=8;row++){
            for(col=1;col<=8-row;col++){

                System.out.print(1);
            }
            for(col=1;col<=row;col++){

                System.out.print(row);
            }
            System.out.println();
        }

    }
}
