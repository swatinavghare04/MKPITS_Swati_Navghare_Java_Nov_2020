/* WAP in java to print number pattern given below :
1
121
12321
1234321
123454321
12345654321
1234567654321
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx06{
    public static void main(String[] args){

        int row,col;
        for(row=1;row<=7;row++){
            for(col=1;col<=row;col++){

                System.out.print(col);
            }

            for(col=row-1;col>=1;col--){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
